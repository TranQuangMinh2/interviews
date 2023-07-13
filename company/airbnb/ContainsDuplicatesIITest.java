import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContainsDuplicatesIITest {
    @Test
    public void testContainsNearbyDuplicate() {
        ContainsDuplicatesII cd = new ContainsDuplicatesII();
        int[] nums1 = {1, 2, 3, 1};
        assertTrue(cd.containsNearbyDuplicate(nums1, 3));  
        int[] nums2 = {1, 0, 1, 1};
        assertTrue(cd.containsNearbyDuplicate(nums2, 1));
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        assertFalse(cd.containsNearbyDuplicate(nums3, 2));
    }
}
