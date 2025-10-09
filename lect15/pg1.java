import java.util.*;
public class pg1 {
    public static void main(String args[]) {

        int matrix[][] = new int[3][3];
        int n = 3;
        int m = 3;
        Scanner sc = new Scanner(System.in);

        // Input elements
        System.out.println("Enter elements of a 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to next row
        }

        sc.close(); // good practice to close Scanner
    }
}
