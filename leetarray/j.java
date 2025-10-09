// public class j{
//     public static int removeduplicate(int array[]){
//         int j = 0;
//         for (int i = 0 ; i< array.length ; i++){
//             if(array[j] != array[i]){
//                 j++;
//                 array[j] = array[i];
//             }
           
//         }
//          return j+1;

//     }
//     public static void main(String args[]){
//         int nums[] = {1,1,1,1,2,2,3,3,4,5,5};
//         int result = removeduplicate(nums) ;
//         System.out.println("array is " + result);

//     }
// }
import java.util.Arrays;

public class j {
    public static int[] twosum(int array[], int target) {
        int arr[] = new int[2];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = twosum(nums, 10);
        System.out.println("Result code: " + Arrays.toString(result));
    }
}
