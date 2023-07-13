import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertSortedArrayToBinarySearchTreeTest {
    @Test
    public void testSortedArrayToBST() {
        ConvertSortedArrayToBinarySearchTree c = new ConvertSortedArrayToBinarySearchTree();
        int[] nums1 = {-10, -3, 0, 5, 9};
        TreeNode root1 = c.sortedArrayToBST(nums1);
        assertEquals(0, root1.val);
        assertEquals(-10, root1.left.val);
        assertEquals(5, root1.right.val);
        int[] nums2 = {1, 3};
        TreeNode root2 = c.sortedArrayToBST(nums2);
        assertEquals(1, root2.val);
    }
}
