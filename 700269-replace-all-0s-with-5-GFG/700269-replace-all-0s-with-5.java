import java.util.*;
class Solution {
    public int convertFive(int n) {
        // code here
        String s = String.valueOf(n);
        s = s.replace('0','5');
        
        return Integer.parseInt(s);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna