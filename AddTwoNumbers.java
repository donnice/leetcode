/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode result = null;
        ListNode iter = null;
        while(l1 != null || l2!=null){
            int firstValue = l1 == null? 0:l1.val;
            int secondValue = l2 == null? 0: l2.val;
            
            sum = (firstValue+secondValue+carry)%10;
            carry = (firstValue+secondValue+carry)/10;
            
            ListNode node = new ListNode(0);
            node.val = sum;
            if(result == null){
                result = node;
                iter = node;
            }
            else{
                iter.next = node;
                iter = node;
            }
            l1 = l1 == null? null:l1.next;
            l2 = l2 == null? null:l2.next;
        }
        ListNode node = new ListNode(0);
        node.next = null;
        if(carry!=0){
            node.val = carry;
            iter.next = node;
            iter = node;
            return result;
        }
        else{
            iter.next = null;
            return result;
        }
    }
}