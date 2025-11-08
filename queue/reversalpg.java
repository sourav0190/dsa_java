// reversal

import java.util.*;

public class reversalpg {
    public static void reversal(Queue<Integer> q) {
        

        Stack<Integer> s = new Stack<>();
       

        while (!q.isEmpty()) {
            s.push(q.poll());
           }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
        System.out.println(q);

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        reversal(q); // or interleave function

    }

}