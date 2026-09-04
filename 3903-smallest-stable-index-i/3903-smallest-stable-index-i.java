class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
    
        int []sm = new int[nums.length];
        sm[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            sm[i] = Math.min(nums[i],sm[i+1]);
        }
        int pm = nums[0];
        for(int i=0;i<n;i++)
        {
            pm = Math.max(nums[i],pm);
            int in = pm - sm[i];

             if(in<=k)
                return i;
            
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna