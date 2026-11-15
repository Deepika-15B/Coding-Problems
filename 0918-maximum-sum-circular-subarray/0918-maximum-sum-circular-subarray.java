class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int sum = nums[0];
       int maxsum= nums[0];

       int minsum = nums[0];
       int min = nums[0];

       int t = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            t+=nums[i];
            minsum = Math.min(nums[i],minsum+nums[i]);
            min = Math.min(min,minsum);

            sum = Math.max(nums[i],sum+nums[i]);
            maxsum = Math.max(sum,maxsum);
        } 

        if(maxsum<0)  return maxsum;

        int r = t-min;
        int res = Math.max(maxsum,r);
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna