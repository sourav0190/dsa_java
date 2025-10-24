public class SBExample {

    // inner Linked List class
    public static class Node {
        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void  addfirst(int data){
        Node newNode = new Node(data) ;
        size++;
        if(head == null){
            head = tail = newNode;
            return ;
        }
        newNode.next = head ;
        head = newNode;
        
    }
       public static void  addlast(int data){
        Node newNode = new Node(data) ;
        size++;
        if(head == null){
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode;
        
    }
    public static void addmiddle(int idx, int data){
        if (idx == 0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data) ;
        Node temp = head;
        int i = 0;
        while(i<idx - 1){
            temp = temp.next;
            i++;
        }
       newNode.next = temp.next;
       temp.next = newNode;


        size++;
        
    }
       public static int search(int key){
        Node temp = head;
        int i = 0;
        while (temp != null) {
            
       if (temp.data == key){
           return i;
       }
       temp = temp.next ;
       i++;
            
        }
        return -1;
    }
    public static  int removefirst(){
        if (size ==0 ){
            System.out.print("ll is empty" + Integer.MIN_VALUE);
            return Integer.MIN_VALUE;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        
        size--;
        System.out.println("val " + val);
        
        return val ;
        
    }
        public static  int removelast(){
        if (size ==0 ){
            System.out.print("ll is empty" + Integer.MIN_VALUE);
            return Integer.MIN_VALUE;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
       
        Node temp = head;
        int i = 0;
        while (temp.next.next != null) {
       temp = temp.next;
    
}

        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        
        
        return val ;
        
    }
 
public static int removeAt(int idx) {
    if (size == 0) {
        System.out.println("Linked list is empty");
        return Integer.MIN_VALUE;
    }

    if (idx == 0) { // remove first node
        int val = head.data;
        head = head.next;
        size--;
        if (head == null) tail = null;
        return val;
    }

    Node temp = head;
    int i = 0;
    while (i < idx - 1 && temp.next != null) {
        temp = temp.next;
        i++;
    }


    int val = temp.next.data;
    temp.next = temp.next.next;

    if (temp.next == null) tail = temp;
    size--;
    return val;
}


    public static void main(String[] args) {
    addfirst(10);
    addfirst(20);
    addfirst(30);
    addfirst(40);
    addlast(50);
    addmiddle(1,30);
    

    print();
    System.out.println("Size: " + size);
    removefirst();
    
    print();
    removelast();
    System.out.println("key at index=" +     search(10) );
     
    print();
    removeAt(3);
    print();
    

    }
}
