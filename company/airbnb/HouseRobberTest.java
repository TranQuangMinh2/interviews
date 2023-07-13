import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HouseRobberTest {
    @Test
    public void testRob() {
        HouseRobber hr = new HouseRobber();
        int[] nums1 = {1, 2, 3, 1};
        assertEquals(4, hr.rob(nums1));
        int[] nums2 = {2, 7, 9, 3, 1};
        assertEquals(12, hr.rob(nums2));
    }
}
