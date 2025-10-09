public class RotatedSearch {
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Found the target
            if (arr[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;  // Target is in left half
                } else {
                    start = mid + 1;  // Target is in right half
                }
            }

            // Right half is sorted
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;  // Target is in right half
                } else {
                    end = mid - 1;  // Target is in left half
                }
            }
        }

        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = search(arr, target);
        System.out.println("Index of " + target + " is: " + index);
    }
}
