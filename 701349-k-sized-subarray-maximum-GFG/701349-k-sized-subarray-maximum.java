class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> ls = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0])
        );
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{arr[i], i});
            while (!pq.isEmpty() && pq.peek()[1] <= i - k) {
                pq.poll();
            }
            if (i >= k - 1) {
                ls.add(pq.peek()[0]);
            }
        }
        return ls;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna