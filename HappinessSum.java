import java.util.Arrays;

public class HappinessSum {
    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int dec = 0, n = happiness.length;
        long ans = 0;
        for (int i = n - 1; i >= n - k; i--) {
            ans += Math.max(0, happiness[i] - dec);
            dec++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] happiness = {5, 10, 3, 8, 6};
        int k = 3;
        long maxHappinessSum = maximumHappinessSum(happiness, k);
        System.out.println("Maximum Happiness Sum: " + maxHappinessSum);
    }
}
