public class ques {
    public static boolean isAnyElementPresentTwice(int[] arr) {
       for(int i = 0 ; i<arr.length;i++){
        int key = arr[i];
        int count = 0;
        for (int j = 0; j< arr.length ;j++){
            if (arr[j]== key){
                count++;
            }

        }
        if (count >=2){
            return true;
        }

       }
       return false;
    }
   public  static int binary(int numbers[],int key){
        int start = 0;
        int end = numbers.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+ 1;
            }
            if(numbers[mid]>key){
                end = mid -1;
            }  
             
        }
        return -1;
        
       
   }


  public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};

        boolean result = isAnyElementPresentTwice(array);
        System.out.println("Any element present exactly twice? " + result);

        int key = 3;
        int value = binary(array, key); 
        System.out.println("Value found using binary search: " + value);
    }
}