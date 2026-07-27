class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n =temperatures.length;
        int []ans = new int[n];

        Stack <Integer> s = new Stack<>();
        for(int i=0;i<n;i++)
        {
        while(!s.isEmpty() && temperatures[i] > temperatures[s.peek()])
        {
            ans[s.peek()] = i-s.peek();
            s.pop();
        }
        s.push(i);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna