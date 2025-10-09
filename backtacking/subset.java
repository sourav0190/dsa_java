public class subset {
    public static void findsubset( String str , String ans,int i){
     if (i == str.length()) {
    if (ans.length() == 0) {
        System.out.println("null");
    } else {
        System.out.println(ans);
    }
    return; // 🔴 Missing this line in your code
}

        findsubset(str, ans + str.charAt(i), i+1);// include the character  like "a" " in  "abc"
        findsubset(str, ans, i+1); // exclude the character like "" in "abc"

    }

    public static void main(String[] args) {
        String str = "abc";
        findsubset(str, "", 0);
        
        
    }
    
}
