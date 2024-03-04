import java.util.Arrays;

public class SwapElements {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original Array: " + Arrays.toString(array));

        Solution solution = new Solution();
        solution.swapElements(array, array.length);

        System.out.println("Array after swapping elements: " + Arrays.toString(array));
    }

    static class Solution {
        public void swapElements(int[] arr, int n) {
            if (n < 3) return;
            for (int i = 0; i < n - 2; i++) {
                int temp = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = temp;
            }
        }
    }
}

