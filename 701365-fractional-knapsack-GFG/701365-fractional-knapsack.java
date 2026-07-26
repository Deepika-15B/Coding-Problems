class Node
{
    int wt;
    int val;
    public Node(int wt,int val)
    {
        this.wt = wt;
        this.val = val;
    }
}
class Solution {
    
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        double ans = 0;
        Node [] items = new Node[wt.length];
        
        for(int i=0;i<wt.length;i++)
        {
            items[i] = new Node(wt[i], val[i]);
        }
    Arrays.sort(items, (a, b) ->
    Double.compare((double)b.val / b.wt,
                   (double)a.val / a.wt));
    
    for(int i=0;i<wt.length;i++)
    {
        if(items[i].wt<=capacity)
        {
             ans = ans+items[i].val;
             capacity -= items[i].wt;
        }
        else
        {
           ans += ((double)capacity * items[i].val) / items[i].wt;
            capacity = 0;
            break;
        }
    }
    return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna