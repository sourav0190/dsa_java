import java.util.*;


public class nge {

    public static int[] nge(int nums[]) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack<Integer> s = new Stack<>();

        // Traverse twice (simulate circular behavior)
        for (int i = 2 * n - 1; i >= 0; i--) {

            // Pop smaller or equal elements
            while (!s.isEmpty() && s.peek() <= nums[i % n]) {
                s.pop();
            }

            // Only fill results in first n passes
            if (i < n) {
                if (s.isEmpty()) {
                    nge[i] = -1;
                } else {
                    nge[i] = s.peek();
                }
            }

            // Push current element (not index this time)
            s.push(nums[i % n]);
        }

        return nge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int res[] = nge(nums);

        System.out.println("Next Greater Elements (Circular):");
        for (int val : res) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
