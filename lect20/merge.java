public class merge {
    public static void mergesort(int arr[], int temp[], int si, int ei) {
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;

        mergesort(arr, temp, si, mid);        // Sort left half
        mergesort(arr, temp, mid + 1, ei);    // Sort right half
        merge(arr, temp, si, mid, ei);        // Merge both halves (❗ corrected call)
    }

    // Function to merge two sorted subarrays into a single sorted array
    public static void merge(int arr[], int temp[], int si, int mid, int ei) {
        int i = si;         // pointer for left subarray
        int j = mid + 1;    // pointer for right subarray
        int k = si;         // pointer for temp array

        // Compare and merge elements from both halves
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= ei) { // ❗ fixed: used i again by mistake
            temp[k++] = arr[j++];
        }

        // Copy merged result back into original array
        for (int x = si; x <= ei; x++) { // ❗ fixed: start → si, end → ei
            arr[x] = temp[x];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int[] temp = new int[arr.length];

        mergesort(arr, temp, 0, arr.length - 1);

        // Print sorted array
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
