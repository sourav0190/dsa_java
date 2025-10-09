
public class trap {
    
    public static int trap(int height[]) {
        // Calculate left max boundary array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max boundary array
        int rightMax[] = new int[height.length];
        int n = height.length;
        rightMax[n - 1] = height[n - 1];
        
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;

        // Loop
        for (int i = 0; i < n; i++) {
            // water level = min(left max bound, right max bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = water level - height[i]
            trappedWater =  trappedWater+ waterLevel - height[i];
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
       System.out.println("Trapped water: " + trap(arr));

    }
}
 