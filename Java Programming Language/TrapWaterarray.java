public class TrapWaterarray {
    public static int trappedrain(int height[]) {
        int n = height.length;
        // calculateleft max boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);

        }
        // calculate right max boundary - array

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]); // ult shuru kiya hai isliye kiya
        }
        int trappedrainWaterv = 0;
        // loop;
        for (int i = 0; i < n; i++) {
            // water level = min(leftmax nound , rightmaxbound);
            int waterLevel = Math.min(leftmax[i], rightMax[i]);
            trappedrainWaterv += waterLevel - height[i];
            // trapped water = waterlevel-height[i];
        }
        // loop
        return trappedrainWaterv;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedrain(height));
    }
}
