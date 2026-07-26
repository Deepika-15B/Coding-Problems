class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int c = 0;
        int i=0; int j=0;
        while(i<g.length && j<s.length)
        {
            if(s[j]>=g[i])
            {
                c++;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna