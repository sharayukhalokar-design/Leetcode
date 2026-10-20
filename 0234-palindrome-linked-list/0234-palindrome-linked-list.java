class Solution {
    ListNode front;

    public boolean isPalindrome(ListNode head) {
        front = head;
        return check(head);
    }

    private boolean check(ListNode current) {
        if (current == null) {
            return true;
        }

        if (!check(current.next)) {
            return false;
        }

        if (front.val != current.val) {
            return false;
        }

        front = front.next;
        return true;
    }
}