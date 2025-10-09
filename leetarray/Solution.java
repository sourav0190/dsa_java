// LeetCode Problem:
// You are given an integer array nums.
// You are allowed to delete any number of elements from nums (but not all).
// After performing deletions, select a subarray such that:
//   - All elements in the subarray are unique.
//   - The sum of the subarray is maximized.
// Return the maximum possible sum of such a subarray.

public class Solution {
    public int maxSum(int[] nums) {
        int n = nums.length;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            boolean isUnique = true;

            for (int j = i; j < n; j++) {
                // Check for duplicates in the current subarray
                for (int k = i; k < j; k++) {
                    if (nums[k] == nums[j]) {
                        isUnique = false;
                        break;
                    }
                }

                if (!isUnique) break;

                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1};
        Solution sol = new Solution();  // Create an instance to call maxSum
        System.out.println("Max Unique Subarray Sum = " + sol.maxSum(nums));
    }
}
