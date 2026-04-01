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
    public void reorderList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        int left = 0;
        int right = list.size()-1;
        while(left <= right) {
            if(left == right) {
                temp.val = list.get(right);
                break;
            }
            temp.val = list.get(left);
            temp = temp.next;
            temp.val = list.get(right);
            temp = temp.next;
            left++;
            right--;
        }
    }
}
