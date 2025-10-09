public class tiling {
    public static int tiling(int n){
       if (n < 0) return 0;  // 🛠️ Add this line
if (n == 0 || n == 1 || n == 2 || n == 3) return 1; // Optional to prevent unnecessary recursion

        // //vertical choice
        // int fnm1 = tiling(n-1);
        // //horizontal choice
        // int fnm2 = tiling(n-4) ;
        int totways = tiling(n-1)+tiling(n-4);
        return totways;
    }
    public static void main(String[] args) {
        int n = 12;
        int result =tiling(n);
        System.out.println("total number of ways is " +result);
    }
    
}
