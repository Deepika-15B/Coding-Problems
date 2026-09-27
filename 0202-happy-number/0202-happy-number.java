class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> set  = new HashSet<>();

        while(!set.contains(n))
        {
            set.add(n);
            n = square(n);
            if(n==1)
            {
                return true;
            }
        }
        return false;
    }
    private int square(int n)
    {
        int res = 0;
        while(n!=0)
        {
            int digit= n%10;
            res +=digit*digit;
            n /=10;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna