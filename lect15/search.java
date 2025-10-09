public class search {
    public static String searchsorted(int numbers[][], int key) {
        int count = 0;  // Count comparisons

        for (int i = 0; i < numbers.length; i++) {
            int start = 0;
            int end = numbers[0].length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                count++;

                if (numbers[i][mid] == key) {
                    return "Found at (" + i + "," + mid + ") after " + count + " searches";
                }

                if (numbers[i][mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return "Not Found after " + count + " searches";
    }
   public static boolean searchingbestmethod(int matrix[][], int key) {
    int row = matrix.length - 1;
    int count = 0;
    int col = 0;

    while (row >= 0 && col < matrix[0].length) {
        count++;
        if (matrix[row][col] == key) {
            System.out.println("found key at (" + row + ", " + col + ") at "+count+"searches");
            return true;
        } else if (key < matrix[row][col]) {
            row--;
        } else {
            col++;
        }
    }

    System.out.println("not found");
    return false;
}

    

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int key = 4;
        System.out.println("search: " + searchsorted(matrix, key));
        System.out.println("search: " + searchingbestmethod(matrix, key));
    }
}
