class Solution {
    public int countCommas(int n) {
        int c = 0;
        for(int i=1;i<=n;i++)
        {
            if(i>=1000)
             c++;
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna