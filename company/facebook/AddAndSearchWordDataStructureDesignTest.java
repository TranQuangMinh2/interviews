import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AddAndSearchWordDataStructureDesignTest {
    @Test
    public void testAddWord() {
        AddAndSearchWordDataStructureDesign wordDictionary = new AddAndSearchWordDataStructureDesign();
        // Test case 1
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertFalse(wordDictionary.search("pad"));
        assertTrue(wordDictionary.search("bad"));
        assertTrue(wordDictionary.search(".ad"));
        assertTrue(wordDictionary.search("b.."));
        // Test case 2
        wordDictionary.addWord("a");
        wordDictionary.addWord("a");
        assertTrue(wordDictionary.search("."));
        assertTrue(wordDictionary.search("a"));
        assertFalse(wordDictionary.search("aa"));
        assertTrue(wordDictionary.search("a"));
        assertFalse(wordDictionary.search(".a"));
        assertFalse(wordDictionary.search("a."));
    }
}
