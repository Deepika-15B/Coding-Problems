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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;

        ListNode fast = head.next;
        ListNode slow = head;

        while( fast!=null&&fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        

        ListNode second = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(second);

        return merge(left,right);
    }
    private ListNode merge(ListNode l,ListNode r)
    {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(l!=null && r!=null){
       if(l.val<r.val)
       {
         tail.next = l;
         l = l.next;
       }
       else
       {
        tail.next = r;
        r = r.next;
       }
       tail = tail.next;
        }
       if(l!=null)
       {
        tail.next = l;
       }
       else
       {
        tail.next = r;
       }
       return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna