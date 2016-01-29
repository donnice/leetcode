public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int steps = k;
        ListNode kTail = head;
        while(--steps>0){ //move k-1 steps
            if(kTail!=null) kTail = kTail.next;
        }
        if(kTail==null) return head; //null head case covered.
        ListNode headNextGropu = kTail.next;
        kTail.next = null;
        ListNode tmp = head;
        head = reverseList(head);
        tmp.next = reverseKGroup(headNextGropu,k);
        return head;
    }
    
     public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)return head;
        else{
            ListNode first = head, second = head.next, temp = null;
            while(second!=null){
                temp = second.next;
                second.next = first;
                first = second;
                second = temp;
            }
            head.next = null; //extremely important!!! Don't forget to set the head.next to null, or it will cause infinite loop 
            return first;
        }
    }
    
}