public class pairup {
    public static int friendspair(int n){
        if (n==1 || n==2){
            return n;
        }
        return friendspair((n-1) + (n-1)*friendspair(n-2)) ;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("total no of ways is"+ friendspair(n));
    }
}
