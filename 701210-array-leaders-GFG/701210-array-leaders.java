class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        if(n==0) return result;
        
        int r = arr[n-1];
        result.add(r);
        
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=r)
            {
                r = arr[i];
                result.add(r);
            }
        }
        Collections.reverse(result);
        
        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna