import java.util.Arrays;

public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        // Square each element in the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Sort the array of squares in non-decreasing order
        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}
