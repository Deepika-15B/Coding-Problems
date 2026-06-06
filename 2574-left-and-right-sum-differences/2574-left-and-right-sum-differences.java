class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
       int []left = new int[n];
       int []right = new int[n];
        int []res = new int[n];
       int s1 = 0;
       int s2 = 0;
       left[0] = 0;
       right[n-1] = 0;
       for(int i=0;i<n-1;i++)
       {
        s1 += nums[i];
        left[i+1]  = s1;
       }
       for(int i=n-1;i>0;i--)
       {
        s2 += nums[i];
        right[i-1] = s2;
       }
       for(int i=0;i<n;i++)
       {
        res[i] = Math.abs(left[i]-right[i]);
       }
return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna