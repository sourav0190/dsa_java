import java.util.*;

public class stackreverse {

    // ============================
    // 1. Reverse using extra stack
    // ============================
//    public static void main(String[] args) {
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        System.out.println("Original Stack: " + s);
//
//        Stack<Integer> s1 = new Stack<>();
//        while (!s.isEmpty()) {
//            s1.push(s.pop());
//        }
//
//        System.out.println("Reversed Stack: " + s1);
//
//        while (!s1.isEmpty()) {
//            System.out.println(s1.pop());
//        }
//    }

    // ======================================
    // 2. Reverse using recursion (no extra stack)
    // ======================================
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Original Stack: " + s);
        reverse(s);
        System.out.println("Reversed Stack: " + s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
