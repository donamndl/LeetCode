class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {    
        if (head == null || left == right) {
            return head;
        }
        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 1: Move prev to node before 'left'
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Reverse sublist
        ListNode curr = prev.next;
        for (int i = 0; i < right - left; i++) {
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        return dummy.next;
        }
}