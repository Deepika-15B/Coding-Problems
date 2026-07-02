class Solution {
    public String reverseWords(String s) {
        String [] word = s.split("\\s+");
        StringBuilder str = new StringBuilder();

        for(int i=word.length-1;i>=0;i--)
        {
            str.append(word[i]);
            if(i!=0)
              str.append(" ");
        }
        return str.toString().trim();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna