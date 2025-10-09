public class fib {
    public static int print(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return print(n - 1) + print(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fib of " + n + " is: " + print(n));
    }
}
