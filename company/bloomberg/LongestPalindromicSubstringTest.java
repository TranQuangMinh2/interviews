import org.junit.Test;

public class LongestPalindromicSubstringTest {
    @Test
    public void testLongestPalindrome() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String s1 = "babad";
        String result1 = lps.longestPalindrome(s1);
        System.out.println(result1); 
        String s2 = "cbbd";
        String result2 = lps.longestPalindrome(s2);
        System.out.println(result2); 
        String s3 = "a";
        String result3 = lps.longestPalindrome(s3);
        System.out.println(result3);
        String s4 = "";
        String result4 = lps.longestPalindrome(s4);
        System.out.println(result4);
        
    }
}
