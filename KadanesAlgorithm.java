class KadanesAlgorithm {
    long maxSubarraySum(int arr[], int n) {
        long sum = 0;
        long max = Integer.MIN_VALUE; 
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        KadanesAlgorithm kadanesAlgorithm = new KadanesAlgorithm();
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = arr.length;
        long maxSum = kadanesAlgorithm.maxSubarraySum(arr, n);
        System.out.println("Maximum contiguous sum is " + maxSum);
    }
}

