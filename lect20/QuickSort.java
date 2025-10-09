public class QuickSort {

    // Main Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort left of pivot
            quickSort(arr, low, pivotIndex - 1);

            // Recursively sort right of pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition the array and return pivot index
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1;       // place for swapping

        for (int j = low; j < high; j++) {
            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at the correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        

        return i; // return the index of pivot
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {6,3,9,8,2,5};

        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
