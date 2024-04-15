public class hasCycle {


    public boolean cycle(ListNode head) {
        if (head == null) {
            return false;
        }
        
        ListNode hare = head;
        ListNode turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
  
        ListNode headWithoutCycle = new ListNode(1);
        headWithoutCycle.next = new ListNode(2);
        headWithoutCycle.next.next = new ListNode(3);
        headWithoutCycle.next.next.next = new ListNode(4);

        ListNode headWithCycle = new ListNode(1);
        headWithCycle.next = new ListNode(2);
        headWithCycle.next.next = new ListNode(3);
        headWithCycle.next.next.next = new ListNode(4);
        headWithCycle.next.next.next.next = headWithCycle.next; // Pointing back to the second node

        hasCycle solution = new hasCycle();

        System.out.println("Does the linked list have a cycle? (Without Cycle): " + solution.cycle(headWithoutCycle));
        System.out.println("Does the linked list have a cycle? (With Cycle): " + solution.cycle(headWithCycle));
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
