
public class fk {
    public static int maxvalue(int val[],int wt[],int capacity) {
        
        int value = 0 ;
         if(val.length != wt.length) {
            return -1;       // same no. of elements
        }
        int n = wt.length;
       
        Integer[] ratio = new Integer[n];

        // store indices
        for (int i = 0; i < n; i++) {
            ratio[i] = val[i]/wt[i];
        }
        for (int i = 0  ; i < n ; i++){
            System.out.print(ratio[i]);
        }
        for(int i = 0 ; i < n ; i++){
        if(capacity >=wt[i]){
            capacity = capacity - wt[i];
            value += val[i];
        }
        else{
            value += ratio[i]*capacity;
        }

        }
        System.out.println("----------------------");
        return value;
        

    }
    public static void main(String[] args) {
        int A[] = {60,100,120};//value

        int B[] = {10,20} ;//weight
        int capacity = 50 ;
       int result = maxvalue(A, B, capacity);
       System.out.println("max value is " + result ) ;
        
    }
    
}
