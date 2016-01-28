public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode quick = head;
        int length = 0;
        while(quick != null){
            quick = quick.next;
            length++;
        }
        if(length == 1)
            return null;
        else if(n == length)
            return head.next;
        int index = length;
        ListNode slow = head;
        while(index!=n+1){
            slow = slow.next;
            index--;
        }
        slow.next = slow.next.next;
        return head;
        
    }
}