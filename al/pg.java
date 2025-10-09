
import java.util.*;



public class pg {
    public static void swap( ArrayList<Integer>List , int i1, int i2){
        int temp = List.get(i1);
        List.set(i1 , List.get(i2));
        List.set(i2 , temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(" "+list);
       
        
        swap(list, 1, 3);  
       System.out.println(" "+list);
       Collections.sort(list,Collections.reverseOrder());
       System.out.println("Sorted: " + list);

    }
   
    
}
