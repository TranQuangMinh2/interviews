import org.junit.Test;

public class LowestCommonAncestorOfABinaryTreeTest {
    @Test
    public void testLowestCommonAncestor() {
        LowestCommonAncestorOfABinaryTree lca = new LowestCommonAncestorOfABinaryTree();
        // Test case 1
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(8);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        assert lca.lowestCommonAncestor(root1, root1.left, root1.right).val == 3;
        // Test case 2
        assert lca.lowestCommonAncestor(root1, root1.left, root1.left.right.right).val == 5;
        // Test case 3
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        assert lca.lowestCommonAncestor(root2, root2, root2.left).val == 1;
    }
}
