public class diagonalsum {
    public static int diagonalsum(int matrix[][]){
            int sum = 0;
        for(int i = 0; i< matrix.length;i++){
         sum = sum + matrix[i][i];
         if(i != matrix.length -1-i){
            sum += matrix[i][matrix.length-1-i];
         }
        
       

        }
         return sum;

    
    }
    public static void main(String[] args) {
        
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("sum is "   +diagonalsum(matrix));
        
    }

}
// import java.util.Scanner;

// public class diagonalsum {
//     public static int diagonalsum(int matrix[][]) {
//         int sum = 0;
//         for (int i = 0; i < matrix.length; i++) {
//             sum += matrix[i][i];  // Primary diagonal
//             if (i != matrix.length - 1 - i) {
//                 sum += matrix[i][matrix.length - 1 - i];  // Secondary diagonal
//             }
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Ask user for size of square matrix
//         System.out.print("Enter size of square matrix (n x n): ");
//         int n = sc.nextInt();

//         int[][] matrix = new int[n][n];

//         // Take input from user
//         System.out.println("Enter " + (n * n) + " elements:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // Call function and print result
//         int result = diagonalsum(matrix);
//         System.out.println("Diagonal sum is: " + result);
//     }
// }
