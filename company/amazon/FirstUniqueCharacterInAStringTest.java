import org.junit.Test;

public class FirstUniqueCharacterInAStringTest {
    @Test
    public void testFirstUniqChar() {
        FirstUniqueCharacterInAString solution = new FirstUniqueCharacterInAString();
        String testString = "leetcode";
        int result = solution.firstUniqChar(testString);
        System.out.println("The first unique character in the string '" + testString + "' is at index: " + result);
        testString = "loveleetcode";
        result = solution.firstUniqChar(testString);
        System.out.println("The first unique character in the string '" + testString + "' is at index: " + result);
    }
}
