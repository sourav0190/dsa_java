import java.util.Scanner;


public class string {
    public static void printchar(String str){
    for(int i = 0;i<str.length();i++){
        System.out.print(str.charAt(i) +"       ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstname;  
        String lastname;
                System.out.println("enter first name");
        System.out.println("enter last name");
        firstname = sc.nextLine();
        lastname  = sc.nextLine();


        String fullname = firstname+ " "+lastname;
        System.out.println("full name is :" +fullname);
        System.out.println(fullname.length());
        printchar(fullname);

        sc.close(); 
    }
}
