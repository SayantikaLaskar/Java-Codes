import java.lang;
public class PalindromicSubstring {

    public int countSubstrings(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            max += expandAroundCenter(s, i, i) + expandAroundCenter(s, i, i + 1);
        }
        return max;
    }

    private int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        PalindromicSubstring solution = new PalindromicSubstring();
        String input = "abba";
        int result = solution.countSubstrings(input);
        
        System.out.println("Number of palindromic substrings: " + result);
    }
}

