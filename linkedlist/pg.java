public class pg {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;  // ✅ Corrected

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;  // ✅ Added return
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrsearch(int key){
        Node temp = head ;
        int i = 0 ;
        while( temp != null){
            if(temp.data == key){
                return i ;
            }
            temp = temp.next;
            i++;
        }
        return - 1;
    }
    //recursive search
    public int helper(Node head ,int key){
        if(head == null){//base case
            return -1 ;

        }
        if(head.data == key){
            return 0 ;
        }
        int idx = helper(head.next, key) ;
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key ){
        return  helper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head ;
        Node next ;
        while( curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next ;

        }
        head = prev; 
    }
    public static void delterfromnthnode(int n){
        //calculate size
        int size = 0 ;
        Node temp = head ;
        while(temp != null){
            temp = temp.next ;
            size ++;

        }
        if( n == size){
            head = head.next ;//remove first element only one element 
            return ;
        }
        //size 
        int i = 1;
        int ito = size - n;
        Node prev = head ;
        while(i < ito){
            prev = prev.next ;
            i++;
        }
        prev.next = prev.next.next ;
        return ;
    }
    public static void main(String[] args) {
        pg list = new pg();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(5);
        list.addlast(6);
        list.addlast(7);
        list.addlast(8);
        list.addlast(9);
        list.add(2, 3);

        list.printList();  // 5 -> 4 -> 3 -> 2 -> 1 -> 6 -> 7 -> 8 -> 9 -> null
        System.out.println("size = " + size);

        list.removeFirst();  // removes 5
        list.printList();    // 4 -> 3 -> 2 -> 1 -> 6 -> 7 -> 8 -> 9 -> null

        list.removeLast();   // removes 9
        list.printList();    // 4 -> 3 -> 2 -> 1 -> 6 -> 7 -> 8 -> null
        System.out.println(list.itrsearch(4));
        System.out.println(list.itrsearch(40));
        System.out.println(list.recsearch(7));
        list.reverse();
        list.printList(); 
        list.delterfromnthnode(4);
        list.printList(); 
       
    }
}
