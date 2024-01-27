public class InversePair {
    private static final int MOD = 1000000007;

    public int kInversePairs(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                int upperLimit = Math.min(j, i - 1);
                int prefixSum = (dp[i - 1][j] - (upperLimit > 0 ? dp[i - 1][upperLimit - 1] : 0) + MOD) % MOD;
                dp[i][j] = (dp[i][j - 1] + prefixSum) % MOD;
            }
        }

        return dp[n][k];
    }

    public static void main(String[] args) {
        InversePair inversePair = new InversePair();
        int n = 3;
        int k = 1;
        int result = inversePair.kInversePairs(n, k);

        System.out.println("Number of arrays with " + k + " inverse pairs: " + result);
    }
}
