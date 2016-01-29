public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        else if(head.next == null) return head;
        else{
            ListNode temp = head.next;
            head.next = swapPairs(temp.next);
            temp.next = head;
            return temp;
        }
    }
}