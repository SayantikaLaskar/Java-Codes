import java.util.Arrays;

public class MajorityElementFinder {

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        Solution solution = new Solution();
        int majorityElement = solution.majorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
