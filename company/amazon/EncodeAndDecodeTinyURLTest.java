import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EncodeAndDecodeTinyURLTest {
    @Test
    public void testEncodeAndDecode() {
        EncodeAndDecodeTinyURL codec = new EncodeAndDecodeTinyURL();
        String url1 = "https://leetcode.com/problems/design-tinyurl";
        String encodedUrl1 = codec.encode(url1);
        String decodedUrl1 = codec.decode(encodedUrl1);
        assertEquals(url1, decodedUrl1);
        String url2 = "https://www.google.com";
        String encodedUrl2 = codec.encode(url2);
        String decodedUrl2 = codec.decode(encodedUrl2);
        assertEquals(url2, decodedUrl2);
    }
}
