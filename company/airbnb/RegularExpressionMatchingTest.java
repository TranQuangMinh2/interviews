import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RegularExpressionMatchingTest {
    @Test
    public void testIsMatch() {
        RegularExpressionMatching r = new RegularExpressionMatching();
        assertTrue(r.isMatch("aa", "a*"));
        assertFalse(r.isMatch("mississippi", "mis*is*p*."));
        assertTrue(r.isMatch("ab", ".*"));
        assertTrue(r.isMatch("aab", "c*a*b"));
    }
}
