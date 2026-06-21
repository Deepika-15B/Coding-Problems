class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0;
        int c = 0;
        for(int i=0;i<costs.length;i++)
        {
            if(coins>=costs[i])
            {
                sum += costs[i];
                c++;
                coins -= costs[i];
            }
            else
            {
                break;
            }

        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna