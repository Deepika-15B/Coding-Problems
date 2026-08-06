class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int l = 0;
        int r = people.length-1;
        int b = 0;
        while(l<=r)
        {
            if(people[l] + people[r] <= limit)
            {
                
                l++;
                r--;
                b++;
            }
            else
            {
                
                r--;
                b++;
            }
        }
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna