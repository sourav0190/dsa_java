public class KadaneMaxMin {
    public static void kalgo(int[] numbers) {
        // For maximum subarray sum
        int maxSum = Integer.MIN_VALUE;
        int currMax = 0;

        // For minimum subarray sum
        int minSum = Integer.MAX_VALUE;
        int currMin = 0;

        for (int i = 0; i < numbers.length; i++) {
            // --- Max Subarray Logic ---
            currMax += numbers[i];
            if (currMax > maxSum) {
                maxSum = currMax;
            }
            if (currMax < 0) {
                currMax = 0;
            }

            // --- Min Subarray Logic ---
            currMin += numbers[i];
            if (currMin < minSum) {
                minSum = currMin;
            }
            if (currMin > 0) {
                currMin = 0;
            }
        }

        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Minimum subarray sum: " + minSum);
    }

    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        kalgo(array);
    }
}
