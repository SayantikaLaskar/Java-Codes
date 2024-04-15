public class RemoveNthFromEnd {

    public ListNode removeNth(ListNode head, int n) {
        // Check if the list is empty or contains only one node
        if (head == null || head.next == null) {
            return null;
        }

        ListNode dummy = new ListNode(0); // Dummy node to handle edge cases
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n nodes ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move fast to the end and slow to the node before the nth node from end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from end by adjusting pointers
        slow.next = slow.next.next;

        return dummy.next; // Return the modified list
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2; 
        System.out.println("Original list:");
        printList(head);
        RemoveNthFromEnd solution = new RemoveNthFromEnd();
        ListNode newHead = solution.removeNth(head, n);
        System.out.println("List after removing " + n + "th node from end:");
        printList(newHead);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
