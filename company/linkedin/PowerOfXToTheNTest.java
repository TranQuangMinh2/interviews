import org.junit.Test;

public class PowerOfXToTheNTest {
    @Test
    public void testMyPow() {
        PowerOfXToTheN pow = new PowerOfXToTheN();
        // Test case 1
        assert pow.myPow(2.0, 10) == 1024.0;
        // Test case 2
        assert pow.myPow(2.1, 3) == 9.261000000000001;
        // Test case 3
        assert pow.myPow(2.0, -2) == 0.25;
        // Test case 4
        assert pow.myPow(1.0, -2147483648) == 1.0;
    }
}
