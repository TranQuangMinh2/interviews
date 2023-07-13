import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MergeKSortedListsTest {
    @Test
    public void testMergeKLists() {
        MergeKSortedLists m = new MergeKSortedLists();
        
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        
        ListNode[] lists1 = {l1, l2, l3};
        ListNode result1 = m.mergeKLists(lists1);
        assertEquals(1, result1.val);
        assertEquals(1, result1.next.val);
        assertEquals(2, result1.next.next.val);
        assertEquals(3, result1.next.next.next.val);
        assertEquals(4, result1.next.next.next.next.val);
        assertEquals(4, result1.next.next.next.next.next.val);
        assertEquals(5, result1.next.next.next.next.next.next.val);
        assertEquals(6, result1.next.next.next.next.next.next.next.val);
    }
}
