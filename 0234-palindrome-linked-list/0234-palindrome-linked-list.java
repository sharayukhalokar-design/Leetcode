class Solution {
    ListNode front;

    public boolean isPalindrome(ListNode head) {
        front = head;
        return checkPalindrome(head);
    }

    public boolean checkPalindrome(ListNode current) {

        if (current == null) {
            return true;
        }

        if (!checkPalindrome(current.next)) {
            return false;
        }

        if (front.val != current.val) {
            return false;
        }

        front = front.next;

        return true;
    }
}