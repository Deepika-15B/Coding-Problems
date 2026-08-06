class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;

        while(l<r)
        {
            max = Math.max(max, (r-l)*Math.min(height[l],height[r]));

            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna