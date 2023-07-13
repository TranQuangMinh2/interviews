import org.junit.Test;

public class LinkedListCycleTest {
    @Test
    public void testHasCycle() {
        LinkedListCycle solution = new LinkedListCycle();
        // Create a linked list with a cycle
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;
        boolean result = solution.hasCycle(head);
        System.out.println("The linked list has a cycle: " + result);
        // Create a linked list without a cycle
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        result = solution.hasCycle(head);
        System.out.println("The linked list has a cycle: " + result);
    }
}
