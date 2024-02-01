import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class divideArray {
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> resultList = new ArrayList<>();

        for (int i = 0; i + 2 < nums.length; i += 3) {
            if (nums[i + 2] - nums[i] <= k) {
                int[] triplet = {nums[i], nums[i + 1], nums[i + 2]};
                resultList.add(triplet);
            } else {
                return new int[0][0];
            }
        }

        return resultList.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 8, 5, 10, 7, 15, 12};
        int k = 5;

        int[][] result = divideArray(nums, k);

        if (result.length == 0) {
            System.out.println("No valid triplets found.");
        } else {
            System.out.println("Valid triplets:");
            for (int[] triplet : result) {
                System.out.println(Arrays.toString(triplet));
            }
        }
    }
}
