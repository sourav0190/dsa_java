import java.util.*;

public class k {
    public static void reversal(Queue<Integer> q, int k) {
        if (q.isEmpty() || k <= 0 || k > q.size()) return;

        Stack<Integer> s = new Stack<>();

        // Step 1: Push first k elements into stack
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }
       
        // Step 2: Enqueue stack elements back to queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // Step 3: Move the remaining elements to the back to maintain original order
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        int k = 5;

        System.out.println("Original Queue: " + q);
        reversal(q, k);
        System.out.println("Queue after reversing first " + k + " elements: " + q);
    }
}
