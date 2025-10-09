// public class subarray {
//     public static void printsub(int numbers[]){
//         int tp = 0;
//         int sum = 0;
//         int largest =Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i = 0; i < numbers.length; i++){
//             for (int j = i; j < numbers.length; j++){
//                 for(int k = i; k <= j; k++){
//                     System.out.print(numbers[k] + " ");
//                     sum = sum + numbers[k];
                    
//             if (largest < sum) {
//                 largest = sum;
//             }
//             if (smallest > sum) {
//                 smallest = sum;
//             }
        
        
                    
//                 }
                
//                 System.out.println("Sum: (" + sum + ")");

//                 tp++;
//                 sum = 0;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Total Subarrays: " + tp);
//         System.out.println("largest: " + largest+ " smallest:   "+smallest);

//     }

//     public static void main(String args[]) {
//         int arr[] = {1, -2, 6, -1,3};
//         printsub(arr);
//     }
// }
public class Main {
    public static void main(String[] args) {
        int[] nums ={1,2,-1,-2,1,0,-1};
        System.out.println("Max Unique Subarray Sum = " + maxUniqueSum(nums));
    }

    public static int maxUniqueSum(int[] nums) {
        int n = nums.length;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            boolean isUnique = true;

            for (int j = i; j < n; j++) {
                // check if nums[j] is already in nums[i...j-1]
                for (int k = i; k < j; k++) {
                    if (nums[j] == nums[k]) {
                        isUnique = false;
                        break;
                    }
                }

                if (!isUnique) break;

                sum += nums[j];
                if (sum > maxSum) maxSum = sum;
            }
        }

        return maxSum;
    }
}
