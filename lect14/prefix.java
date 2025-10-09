public class prefix {

    public static void printsub(int numbers[]) {
        int tp = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int[] prefix = new int[numbers.length];
        prefix[0] = numbers[0];

        // Step 1: Build prefix array
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Step 2: Generate all subarrays using prefix sums
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum;
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }

                // Print subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println("Sum: (" + sum + ")");

                // Track max and min
                if (largest < sum) largest = sum;
                if (smallest > sum) smallest = sum;

                tp++;
                System.out.println();
            }
        }

        System.out.println("Total Subarrays: " + tp);
        System.out.println("Largest: " + largest + ", Smallest: " + smallest);
    }

    public static void main(String args[]) {
        int arr[] = {1, -2, 6, -1, 3};
        printsub(arr);
    }
}
