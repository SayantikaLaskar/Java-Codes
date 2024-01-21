public class MoveZeros {
    public static void moveZeros(int[] nums) {
        int nonZeroIndex = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, move it to the front
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                // If the current element is not already at the front, set its original position to zero
                if (nonZeroIndex != i) {
                    nums[i] = 0;
                }
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums = {0, 1, 0, 3, 12};
        
        System.out.println("Original Array: " + java.util.Arrays.toString(nums));

        moveZeros(nums);

        System.out.println("Modified Array: " + java.util.Arrays.toString(nums));
    }
}

