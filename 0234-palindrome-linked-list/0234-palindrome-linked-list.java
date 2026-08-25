class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }  
        ListNode prev = null;
        ListNode next;

        while(slow !=null){
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }  

        ListNode right =  prev;  
        ListNode left = head;

        while(right != null){
            if(left.val != right.val){
                return false;
            }
            right = right.next;
            left = left.next;
        } 
        return true;
    }
}