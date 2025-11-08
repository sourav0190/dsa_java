import java.util.*;

public class activity {

    static int maxact;   // ✅ so main() can access it

    public static ArrayList<String> max(int start[], int finish[]) {

        int n = finish.length;
        ArrayList<String> list = new ArrayList<>();
        Integer[] idx = new Integer[n];

        // store indices
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        // sort indices based on finish time
        Arrays.sort(idx, (i, j) -> Integer.compare(finish[i], finish[j]));

        // create sorted start[] and finish[]
        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = start[idx[i]];
            b[i] = finish[idx[i]];
        }

        // select first activity
        int lastfinish = b[0];
        maxact = 1;
        list.add("A" + idx[0]);

        // select remaining
        for (int i = 1; i < n; i++) {
            if (a[i] >= lastfinish) {
                list.add("A" + idx[i]);
                lastfinish = b[i];
                maxact++;
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[]   = {2, 4, 6, 7, 9, 9};

        System.out.println("Selected Activities:");
        System.out.println(max(start, finish));

        System.out.println("Maximum activities = " + maxact);
    }
}
