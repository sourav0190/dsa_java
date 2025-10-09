public class sum{
    public static int print(int n ){
        if (n==0 ){
            return  0;
        }
        
         return n + print(n-1);

    }
    public static void main(String[] args){
        int n = 10;
        
        System.out.println("sum of " + n + " is: " + print(n));
    }
}