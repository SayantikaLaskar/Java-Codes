import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2}; // Example array, you can replace it with any array of your choice
        DuplicateNumber solution = new DuplicateNumber();
        int duplicate = solution.findDuplicate(nums);
        if (duplicate != -1) {
            System.out.println("Duplicate number: " + duplicate);
        } else {
            System.out.println("No duplicate found.");
        }
    }

    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
