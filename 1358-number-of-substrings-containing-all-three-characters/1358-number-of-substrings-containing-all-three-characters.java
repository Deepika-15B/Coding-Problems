class Solution {
    public int numberOfSubstrings(String s) {
        int []count = new int[3];
        int l = 0;
        int a = 0;
        int n = s.length();
        for(int right = 0;right<s.length();right++)
        {
            count[s.charAt(right)-'a']++;
            while(count[0]>0 && count[1] >0 && count[2]>0)
            {
                a+=n - right;
                count[s.charAt(l)-'a']--;
                l++;
            }
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna