import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BinaryTreeLevelOrderTraversalTest {
    @Test
    public void testLevelOrder() {
        BinaryTreeLevelOrderTraversal b = new BinaryTreeLevelOrderTraversal();
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        List<List<Integer>> result1 = b.levelOrder(root1);
        List<List<Integer>> expected1 = new ArrayList<List<Integer>>();
        expected1.add(new ArrayList<Integer>() {{add(3);}});
        expected1.add(new ArrayList<Integer>() {{add(9); add(20);}});
        expected1.add(new ArrayList<Integer>() {{add(15); add(7);}});
        assertEquals(expected1, result1);
    }
}
