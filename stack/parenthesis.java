import java.util.*;
public class parenthesis {
    public static  boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else if (c == ')' || c == '}' || c == ']'){
                if(st.isEmpty()){
                    return false;
                }
                else if(( c == ')' && st.peek() == '(' )
                || (c == '}' && st.peek() == '{' )
                || (c == ']' && st.peek() == '[')){
                    st.pop();
                }
                else{
                    return  false;
                }

                
            }

        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
       
    }
public static void main(String[] args) {
    String str = "s90[]({)})";
    System.out.println(isValid(str));
}

}
