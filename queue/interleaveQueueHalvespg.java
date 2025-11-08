// first non repating integer 

import java.util.*;

public class interleaveQueueHalvespg {
    public static void interleaveQueueHalves(Queue<Integer> q) {
        int n = q.size();

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 0; i < n / 2; i++) {
            q1.add(q.poll());
        }

        while (!q.isEmpty() || !q1.isEmpty()) {
            if (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
            if (!q.isEmpty()) {
                q2.add(q.poll());
            }

        }
        System.out.println(q2);

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        interleaveQueueHalves(q); // or interleave function

    }

}