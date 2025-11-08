public class cir {
    public static class queue {
        int arr[];
        int rear;
        int front;
        int size;

        queue(int n ){
            arr = new int[n];
            rear = -1;
            front = -1 ;
            size = n;

        }

        public boolean isEmpty() {
            return front == -1 && rear == -1;

        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public void add(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
                
            }
            if (isEmpty()) {
                front = 0;
                rear = 0 ;
            } else {
                rear = (rear + 1) % size;
            }
            arr[rear] = data;
        }
           public int remove() {
            
            
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
           
            } 
            int  result = arr[front] ;
            if (front == rear ){
                front = rear = -1;
            }
            else{
                front = (front +1)%size ;
            }
            return result ;
           
        }
        public int peek(){
             if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
           
            } 
            return arr[front];

        }
    }
    public static void main(String[] args) {
        queue q = new queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        q.add(4);
        q.add(5);
        q.add(6);
        q.remove();
        q.add(7);
         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}