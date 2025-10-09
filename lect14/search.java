public class search {
    public static int getlargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }
    public static int linearsearch(int number[],int key){
        for(int i = 0; i< number.length ;i++){
           if (number[i]==key){
            return i;
            }
        }
           return -1;
    }
    public static int binarysearch(int numbers[],int key){
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
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void reverse(int numbers[]){
        int a = 0;
        int b = numbers.length - 1;
        while(a<b){
            //swap
            int temp =numbers[b];
            numbers[b]=numbers[a] ;
            numbers[a]=temp;
            a++;
            b--;


        }
        
    }
    

    public static void main(String args[]) {
        int number[] = { 32, 45, 11};
        int key = 32;
        System.out.println("largest is " + getlargest(number));
        int index = linearsearch(number, key);
        int indexb = binarysearch(number, key);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index "+index);
    }
      if(indexb == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index "+index);
    }
    reverse(number);
    for(int i = 0;i<number.length;i++){
        System.out.print(number[i] + " ");

    }
    System.out.println();
    }
}

