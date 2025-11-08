import java.util.*;

public class hist {

    public static int maxarea(int heights[]) {
        int max = 0;
        int n = heights.length;
        int nsl[] = new int[n];
        int nsr[] = new int[n];
        Stack<Integer> s = new Stack<>();

        // Next Smaller to Left
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) nsl[i] = -1;
            else nsl[i] = s.peek();
            s.push(i);
        }

        // Next Smaller to Right
        s = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) nsr[i] = n;
            else nsr[i] = s.peek();
            s.push(i);
        }

        // Compute max area
        for (int i = 0; i < n; i++) {
            int h = heights[i];
            int w = nsr[i] - nsl[i] - 1;
            int curr = h * w;
            max = Math.max(max, curr);
        }

        return max;
    }

    public static void main(String[] args) {
        int heights[] = {2, 1, 5, 6, 2, 3};
        System.out.println("Max area: " + maxarea(heights));
    }
}
