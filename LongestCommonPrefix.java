import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String arr[], int n) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(arr);

        char[] first = arr[0].toCharArray();
        char[] last = arr[n - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            } else {
                ans.append(first[i]);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String[] array = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(array, array.length);
        System.out.println(result);
    }
}
