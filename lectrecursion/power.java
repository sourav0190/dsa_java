public class power {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int half = pow(x, n / 2);

        int halfnum = half * half;

        if (n % 2 == 0) {
            return halfnum;
        } else {
            return x * halfnum;
        }
    }

    public static void main(String[] args) {
        System.out.println("power: " + pow(2, 5));  
    }
}
