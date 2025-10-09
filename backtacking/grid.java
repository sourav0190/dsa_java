public class grid {
    // public static int gridways(int i, int j, int n, int m) {
    //     // ✅ Reached bottom-right cell
    //     if (i == n - 1 && j == m - 1) {
    //         return 1;
    //     }

        
    //     else if (i >= n || j >= m) {
    //         return 0;
    //     }

    //     // ✅ Try moving down and right
    //     int w1 = gridways(i + 1, j, n, m); // down
    //     int w2 = gridways(i, j + 1, n, m); // right

    //     return w1 + w2;
    // }
        public static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Calculate nCr
    public static long nCr(int n, int m) {
        if (m > n) return 0; // invalid
        return factorial(n + m -1 -1) / (factorial(m-1) * factorial(n - 1));
    }

    public static void main(String[] args) {
        System.out.println("Total number of ways: " + nCr(4, 4));
    }
}
