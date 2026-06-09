class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max= nums[0];
        long min = nums[0];
        for(int num:nums)
        {
            max = Math.max(num,max);
            min = Math.min(num,min);
        }
        long res = (max-min) *k;
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna