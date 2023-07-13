import org.junit.Test;

public class OneEditDistanceTest {
    @Test
    public void testIsOneEditDistance() {
        OneEditDistance oed = new OneEditDistance();
        // Test case 1
        assert oed.isOneEditDistance("ab", "acb") == true;
        // Test case 2
        assert oed.isOneEditDistance("", "") == false;
        // Test case 3
        assert oed.isOneEditDistance("a", "") == true;
        // Test case 4
        assert oed.isOneEditDistance("a", "A") == true;
        // Test case 5
        assert oed.isOneEditDistance("teacher", "tacher") == true;
    }
}
