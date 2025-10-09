public class firstoccurence {
      public static int print(int arr[], int key,int i) {
        if (i > arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return print(arr,key,i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 41, 5, 6, 7, 8, 9};
        System.out.println("first occurence " + print(arr, 19,0));
    
}
}