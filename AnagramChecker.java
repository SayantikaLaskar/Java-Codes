import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String s, String t) {
        // Check if the lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        // Compare the sorted char arrays
        return Arrays.equals(charArrayS, charArrayT);
    }

    public static void main(String[] args) {
        // Example usage
        String s1 = "listen";
        String t1 = "silent";
        System.out.println("Are \"" + s1 + "\" and \"" + t1 + "\" anagrams? " + areAnagrams(s1, t1));

        String s2 = "hello";
        String t2 = "world";
        System.out.println("Are \"" + s2 + "\" and \"" + t2 + "\" anagrams? " + areAnagrams(s2, t2));
    }
}

