import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContainsDuplicateTest {
    @Test
    public void testContainsDuplicate() {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums1 = {1, 2, 3, 4};
        assertFalse(cd.containsDuplicate(nums1));
        int[] nums2 = {1, 2, 3, 1};
        assertTrue(cd.containsDuplicate(nums2));
    }
}
