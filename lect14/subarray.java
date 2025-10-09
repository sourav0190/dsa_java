public class subarray {
    // Method to print all subarrays and find the one with maximum sum
    public static void printSubarrays(int[] arr) {
        int totalSubarrays = 0;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Outer loop: Starting point of subarray
        for (int start = 0; start < arr.length; start++) {
            // Inner loop: Ending point of subarray
            for (int end = start; end < arr.length; end++) {
                currentSum = 0;

                // Loop to print the subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    currentSum += arr[k];
                }

                System.out.println("Sum: (" + currentSum + ")");
                maxSum = Math.max(maxSum, currentSum);
                totalSubarrays++;
                System.out.println();
            }

            System.out.println();
        }

        System.out.println("Total Subarrays: " + totalSubarrays);
        System.out.println("Largest Subarray Sum: " + maxSum);
    }

    // Main method
    public static void main(String[] args) {
        int[] array = {11, 21, 31, 41};  // You can change this to test
        printSubarrays(array);
    }
}
