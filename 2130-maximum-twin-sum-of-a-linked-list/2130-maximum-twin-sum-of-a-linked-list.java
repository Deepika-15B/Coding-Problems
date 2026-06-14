/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList <Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        int maxsum = 0;
        int i = 0;
        int j = list.size()-1;

        while(i<j)
        {
            maxsum = Math.max(maxsum,list.get(i) + list.get(j));
            i++;
            j--;
        }
        return maxsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna