public class sort {
    public static int bubble(int number[]) {
        int swap = 0; // total swap counter
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - i - 1; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                    swap++;
                }
            }
        }
        return swap; // return total swaps
    }

    public static void print(int number[]) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        int totalSwaps = bubble(arr);
        print(arr);
        System.out.println("Total swaps: " + totalSwaps);
    }
}
