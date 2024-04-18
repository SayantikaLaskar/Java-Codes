import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {
    public static int split(int[] nums, int k) {
        int left = Arrays.stream(nums).max().getAsInt();
        int right = Arrays.stream(nums).sum();

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 1;
            int currentSum = 0;
            for (int num : nums) {
                currentSum += num;
                if (currentSum > mid) {
                    currentSum = num;
                    count++;
                }
            }
            if (count > k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int result = split(nums, k);
        System.out.println(result);
    }
}
