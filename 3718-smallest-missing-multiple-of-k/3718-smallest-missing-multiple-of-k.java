class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList <Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(nums[i]);

        }
        int j=1;
        while(al.contains(k*j))
        {
            j++;

        }
        return k*j;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna