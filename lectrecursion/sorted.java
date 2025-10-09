public class sorted {
    public static boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 41, 5, 6, 7, 8, 9};
        System.out.println("Is it sorted? " + issorted(arr, 0));
    }
}
