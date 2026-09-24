class Solution {

    void reverse(ListNode head, int k) {
        ListNode prev = null, curr = head;
        while (k-- > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode left = head, prev = null, res = null;
        while (left != null && left.next != null) {
            ListNode right = left.next;
            ListNode next = right.next;
            reverse(left, 2);
            if (prev != null){
                prev.next = right;
            }
            else{
                res = right;
            }
            prev = left;
            left = next;
        }
        prev.next = left;
        return res;
    }
}