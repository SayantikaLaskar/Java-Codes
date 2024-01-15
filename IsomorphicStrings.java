import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapping = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if the character in s is already mapped
            if (mapping.containsKey(charS)) {
                // If it is, make sure it is mapped to the same character in t
                if (mapping.get(charS) != charT) {
                    return false;
                }
            } else {
                // If the character in s is not mapped, check if the character in t is already used
                if (mapping.containsValue(charT)) {
                    return false;
                }
                // Map the character in s to the character in t
                mapping.put(charS, charT);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";
        System.out.println("Are '" + s1 + "' and '" + t1 + "' isomorphic? " + isIsomorphic(s1, t1));

        String s2 = "foo";
        String t2 = "bar";
        System.out.println("Are '" + s2 + "' and '" + t2 + "' isomorphic? " + isIsomorphic(s2, t2));

        String s3 = "paper";
        String t3 = "title";
        System.out.println("Are '" + s3 + "' and '" + t3 + "' isomorphic? " + isIsomorphic(s3, t3));
    }
}
