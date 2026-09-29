class Solution {
    public String replaceDigits(String s) {
        char []ch = s.toCharArray();
        for(int i=1;i<ch.length;i+=2)
        {
            int x = ch[i]-'0';

            ch[i] = (char)(ch[i-1]+x);
        }
        return new String (ch);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna