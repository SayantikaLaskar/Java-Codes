import java.util.HashSet;

public class MissingPositive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums)); // Output: 2
    }

    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0)
                set.add(num);
        }
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (!set.contains(i))
                return i;
        }

        return -1;
    }
}

