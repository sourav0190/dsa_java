public class InversionCount {

    public static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int mid, invCount = 0;

        if (left < right) {
            mid = (left + right) / 2;

            invCount += mergeSort(arr, temp, left, mid);
            invCount += mergeSort(arr, temp, mid + 1, right);

            invCount += merge(arr, temp, left, mid, right);
        }
        return invCount;
    }

    public static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;     // Left subarray
        int j = mid + 1;  // Right subarray
        int k = left;
        int invCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];

                // All remaining elements in left subarray form inversions
                invCount += (mid - i + 1);
            }
        }

        // Copy remaining elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int[] temp = new int[arr.length];
        int inversionCount = mergeSort(arr, temp, 0, arr.length - 1);

        System.out.println("Number of inversions: " + inversionCount);
    }
}
