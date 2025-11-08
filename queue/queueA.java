public class queueA {

    // static inner class as 
    public static class queue {
        int arr[];
        int size;
        int rear;

        // constructor
        queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // check if queue is empty
        public boolean isEmpty() {
            return rear == -1;
        }

        // add element
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove element
        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1; // return -1 when queue is empty
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek at front
        public int peek() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1; // return -1 if queue is empty
            }
            return arr[0];
        }
    }

    // main method
    public static void main(String[] args) {
        queue q = new queue(3); // create object of static inner class
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
