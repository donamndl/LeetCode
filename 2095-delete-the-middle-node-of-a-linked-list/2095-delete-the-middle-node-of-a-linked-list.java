class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode Slow = head;
        ListNode Fast = head;
        ListNode Prev = null;
        while(Fast != null && Fast.next != null){
            Prev = Slow;
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        Prev.next = Slow.next;
        return head;    
    }
}