class Solution {
    void reverse(ListNode head, int times) {
        ListNode curr = head;
        ListNode prev = null;
        while (times-- > 0) {
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        int size = 2;
        ListNode left = head;
        ListNode right;
        ListNode res = null;
        ListNode prevleft = null;
        while (true) {
            right = left;
            // Find the second node of the pair
            for (int i = 0; i < size - 1; i++) {
                if (right == null)
                    break;
                right = right.next;
            }
            // Pair exists
            if (right != null) {
                ListNode nextleft = right.next;
                // Reverse 2 nodes
                reverse(left, size);
                // Connect previous pair
                if (prevleft != null)
                    prevleft.next = right;
                prevleft = left;
                // First pair gives the new head
                if (res == null)
                    res = right;
                left = nextleft;
            }
            // Less than 2 nodes remaining
            else {
                if (prevleft != null)
                    prevleft.next = left;
                if (res == null)
                    res = left;
                break;
            }
        }
        return res;
    }
}