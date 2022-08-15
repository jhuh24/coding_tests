class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode reversed = new ListNode();
        while (head != null) {
            ListNode temp = new ListNode();
            reversed.val = head.val;
            if (head.next == null) {
                break;
            }
            temp.next = reversed;
            reversed = temp;
            temp = new ListNode();
            head = head.next;
        }
        return reversed;
    }
}