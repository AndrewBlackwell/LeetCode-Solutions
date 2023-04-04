//--------------------------------------------------------------------
// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists in a one sorted list. 
// The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.
// 
// Example 1:
// Input: list1 = [], list2 = []
// Output: []
// 
// Example 2:
// Input: list1 = [], list2 = [0]
// Output: [0]
//------------

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
class Solution 
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (l1 != null && l2 != null) 
        {
            if (l1.val < l2.val) 
            {
                temp.next = l1;
                l1 = l1.next;
            } 
            else 
            {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = l1 != null ? l1 : l2;
        return head.next;
    }
}
