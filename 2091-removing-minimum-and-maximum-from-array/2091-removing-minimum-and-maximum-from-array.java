class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = 0;
        int max = 0;

        for(int i=0;i<n;i++)
        {
            if(nums[i]<nums[min]) min = i;
            if(nums[i]>nums[max]) max = i;
        }
        int left = Math.min(min,max);
        int right = Math.max(min,max);
        
        int f = right+1;
        int r = n-left;
        int b = (left+1) + (n-right);

        int m = Math.min(f,Math.min(r,b));

        return m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna