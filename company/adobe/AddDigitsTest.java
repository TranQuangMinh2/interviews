import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddDigitsTest {
    @Test
    public void testAddDigits() {
        AddDigits ad = new AddDigits();
        assertEquals(2, ad.addDigits(38));
    }
}
