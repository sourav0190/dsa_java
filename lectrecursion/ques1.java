public class ques1 {
    public static void print(int arr[], int key, int i) {
        if (i > arr.length - 1) {
            return; // base case: end of array
        }

        if (arr[i] == key) {
            System.out.print(i + " "); // print index if match found
        }

        print(arr, key, i + 1); // recursive call to next index
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 5, 6, 2, 8, 2};
        print(arr, 2, 0); // find all positions of 2
        System.out.println(); // for newline after output
    }
}
