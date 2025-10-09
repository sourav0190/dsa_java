public class fact{
    public static int print(int n ){
        if (n==0){
            return  1;
        }
        
         return n* print(n-1);

    }
    public static void main(String[] args){
        int n = 5;
        
        System.out.println("Factorial of " + n + " is: " + print(n));
    }
}