class Solution {
    public boolean isArraySpecial(int[] nums) {
        //boolean b = true;
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            //int a1=0;
            if((nums[i]%2==0 && nums[j]%2==0)||(nums[i]%2!=0 && nums[j]%2!=0))
            {
                return false;
            }
        
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna