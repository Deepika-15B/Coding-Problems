class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int t=numBottles;
        //int rem=0;
        while(numBottles>=numExchange){
            int newbottles = numBottles/numExchange;
             int rem = numBottles%numExchange;
            t+=newbottles;
            numBottles=newbottles+rem;
        }
        return t;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna