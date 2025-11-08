public class link {

    // static inner class as per teacher
    public static class queue {

        // Node representation
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node front;
        Node rear;

        // constructor
        queue() {
            front = rear = null;
        }

        // check if queue is empty
        public boolean isEmpty() {
            return front == null;
        }

        // add element (enqueue)
        public void add(int data) {
            Node newNode = new Node(data);

            if (rear == null) {   // empty queue
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        // remove element (dequeue)
        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int val = front.data;
            front = front.next;

            if (front == null)    // queue becomes empty
                rear = null;

            return val;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            return front.data;
        }
    }

    // main method
    public static void main(String[] args) {
        queue q = new queue(); // linked list queue

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
