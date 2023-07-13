import org.junit.Test;

public class ReverseWordsInAStringTest {
    @Test
    public void testReverseWords() {
        ReverseWordsInAString solution = new ReverseWordsInAString();
        String testString = "the sky is blue";
        String result = solution.reverseWords(testString);
        System.out.println("The reversed string is: '" + result + "'");
        testString = "  hello world!  ";
        result = solution.reverseWords(testString);
        System.out.println("The reversed string is: '" + result + "'");
    }
}
