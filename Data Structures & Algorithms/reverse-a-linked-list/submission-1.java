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
// import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp1 = head;
        while(temp1 != null) {
            list.add(temp1.val);
            temp1 = temp1.next;
        }
        Collections.reverse(list);
        ListNode result = new ListNode(0);
        ListNode mainResult = result;
        for(int i = 0; i < list.size(); i++) {
            ListNode temp3 = new ListNode(list.get(i));
            result.next = temp3;
            result = result.next;
            
        }
        return mainResult.next;


    }
}












