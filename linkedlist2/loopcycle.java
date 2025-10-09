public class loopcycle {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head; // head of the linked list

    // Detect cycle using Floyd’s algorithm
    public static boolean iscycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // +1
            fast = fast.next.next;  // +2

            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false;
    }

    // Remove cycle if it exists (return true if removed, false otherwise)
    public static boolean removecycle() {
        Node slow = head;
        Node fast = head;

        // Step 1: detect cycle
        boolean cycleExists = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }

        if (!cycleExists) return false; // no cycle

        // Step 2: find start of cycle
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: break the cycle
        prev.next = null;

        return true; // cycle was removed
    }

    // Print linked list safely
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Create a cycle (4 -> 2)
        head.next.next.next.next = head.next;

        System.out.println("Cycle exists? " + iscycle());

        boolean removed = removecycle();
        System.out.println("Cycle removed? " + removed);

        System.out.println("Cycle exists after removal? " + iscycle());

        printList(head);
    }
}
