public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode PointerA = headA;
        ListNode PointerB = headB;
        while(PointerA != PointerB){
            PointerA = (PointerA == null) ? headB : PointerA.next;
            PointerB = (PointerB == null) ? headA : PointerB.next;
        }
        return PointerA;      
    }
}