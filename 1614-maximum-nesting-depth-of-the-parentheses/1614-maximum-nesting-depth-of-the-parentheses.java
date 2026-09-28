class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int max = 0;
        for(char ch : s.toCharArray())
        {
            if(ch=='(')
            {
                depth++;
                if(depth>max) max = depth;
            }
            else if(ch==')')
              depth--;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna