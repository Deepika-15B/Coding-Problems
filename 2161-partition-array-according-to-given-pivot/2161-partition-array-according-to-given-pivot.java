class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int []arr = new int[n];
        int s = 0;
        int g = 0;
        for(int i=0;i<n;i++)
        {
             if(nums[i]<pivot)
             {
                 s++;
             }
             else if( nums[i]==pivot)
             {
               g++;
             }
             
        }
        int i=0;
        int j=s;
        int k = s+g;
        for(int num : nums)
        {
            if(num<pivot)
            {
                arr[i++] = num;
            }
             else if (num == pivot) {
                arr[j++] = num;
            } else {
                arr[k++] = num;
            }
           
        }
        
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna