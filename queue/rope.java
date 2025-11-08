
import java.util.PriorityQueue;

public class rope {
    public static int pg(int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int res = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res = res + first + second;
            pq.add(first + second);
        }
        return res;
    }

    public static void main(String[] args) {

        int len[] = { 1 ,2 ,3 };
        
        System.out.println("Total cost for connecting"
                + " ropes is "
                + pg(len));
    }

}
