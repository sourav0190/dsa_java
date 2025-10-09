public class palindrome {
    public static boolean check(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("Not a palindrome");
                return false;
            }
        }
        System.out.println("Yes, palindrome");
        return true;
    }

    public static void main(String[] args) {
        String str = "nitin";

        // Optional: store and print result
        boolean result = check(str);
        System.out.println("Result: " + result);
    }
}
