import java.util.*;

public class stackandqueue {

    // --- STACK IMPLEMENTATION ---
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    // --- QUEUE IMPLEMENTATION ---
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void enqueue(int data) {
            deque.addLast(data);  // add to rear
        }

        public int dequeue() {
            return deque.removeFirst();  // remove from front
        }

        public int peek() {
            return deque.getFirst();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        // STACK DEMO
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Stack peek: " + s.peek()); // 4
        System.out.println("Stack pop: " + s.pop());   // 4

        System.out.print("Stack remaining: ");
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");           // 3 2 1
        }
        System.out.println("\n");

        // QUEUE DEMO
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("Queue peek: " + q.peek()); // 1
        System.out.println("Queue dequeue: " + q.dequeue()); // 1

        System.out.print("Queue remaining: ");
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");       // 2 3 4
        }
    }
}
