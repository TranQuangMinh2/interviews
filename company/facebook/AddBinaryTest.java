import org.junit.Test;

public class AddBinaryTest {
    @Test
    public void testAddBinary() {
        AddBinary ab = new AddBinary();
        // Test case 1
        String a1 = "11";
        String b1 = "1";
        String result1 = ab.addBinary(a1, b1);
        System.out.println(result1); // Expected output: "100"
        // Test case 2
        String a2 = "1010";
        String b2 = "1011";
        String result2 = ab.addBinary(a2, b2);
        System.out.println(result2); // Expected output: "10101"
        // Test case 3
        String a3 = "0";
        String b3 = "0";
        String result3 = ab.addBinary(a3, b3);
        System.out.println(result3); // Expected output: "0"
        
    }
}
