import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        TwoSum ts = new TwoSum();
        
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = ts.twoSum(nums1, target1);
        assertArrayEquals(new int[]{0, 1}, result1);
        
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = ts.twoSum(nums2, target2);
        assertArrayEquals(new int[]{1, 2}, result2);
    }
}
