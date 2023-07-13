import org.junit.Test;

public class ThreeSumSmallerTest {
    @Test
    public void testThreeSumSmaller() {
        ThreeSumSmaller tss = new ThreeSumSmaller();
        // Test case 1
        int[] nums1 = {-2, 0, 1, 3};
        int target1 = 2;
        int result1 = tss.threeSumSmaller(nums1, target1);
        System.out.println(result1); // Expected output: 2
        // Test case 2
        int[] nums2 = {};
        int target2 = 0;
        int result2 = tss.threeSumSmaller(nums2, target2);
        System.out.println(result2); // Expected output: 0
        // Test case 3
        int[] nums3 = {1, 1, -2};
        int target3 = 1;
        int result3 = tss.threeSumSmaller(nums3, target3);
        System.out.println(result3); // Expected output: 1        
    }
}
