public class ques1 {
    public static int isAnyElementPresentTwice(int[] arr) {
       for(int i = 0 ; i<arr.length;i++){
        int key = arr[i];
        int count = 0;
        for (int j = 0; j< arr.length ;j++){
            if (arr[j]== key){
                count++;
            }

        }
        if (count >= arr.length/2){
            return key;
        }

       }
       return -1;
    }
    
      public static void main(String[] args) {
        int[] array = {
    2, 2, 2, 1,1,1,2,3,3,3,3,3,3,3,3,3
};

int result = isAnyElementPresentTwice(array);
        System.out.println("majority element " + result);

      }
}


