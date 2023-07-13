import org.junit.Test;

public class Utf8ValidationTest {
    @Test
    public void testValidUtf8() {
        Utf8Validation uv = new Utf8Validation();
        // Test case 1
        int[] data1 = {197, 130, 1};
        boolean result1 = uv.validUtf8(data1);
        System.out.println(result1); // Expected output: true
        // Test case 2
        int[] data2 = {235, 140, 4};
        boolean result2 = uv.validUtf8(data2);
        System.out.println(result2); // Expected output: false
        // Test case 3
        int[] data3 = {255};
        boolean result3 = uv.validUtf8(data3);
        System.out.println(result3); // Expected output: false
        
    }
}
