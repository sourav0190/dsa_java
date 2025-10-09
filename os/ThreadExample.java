// TaskA thread
class TaskA extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); // sleep 1 second
            } catch (InterruptedException e) {
                // ignore for now
            }
            System.out.println("TaskA: " + i);
        }
    }
}

// TaskB thread
class TaskB extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); // sleep 1 second
            } catch (InterruptedException e) {
                // ignore for now
            }
            System.out.println("TaskB: " + i);
        }
    }
}

// Main class with main method
public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        // Create thread objects
        TaskA t1 = new TaskA();
        TaskB t2 = new TaskB();

        // Start threads
        t1.start();
        t2.start();

        // Optional: wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Both threads finished!");
    }
}
