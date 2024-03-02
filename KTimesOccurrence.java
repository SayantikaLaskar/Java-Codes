import java.util.HashMap;

public class KTimesOccurrence {
    public int firstElementKTime(int n, int k, int[] a) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            frequencyMap.put(a[i], frequencyMap.getOrDefault(a[i], 0) + 1);
            if (frequencyMap.get(a[i]) == k) {
                return a[i];
            }
        }

        return -1; // If no such element is found
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 5, 6, 2, 2};
        int k = 3;

        KTimesOccurrence solution = new KTimesOccurrence();
        int result = solution.firstElementKTime(nums.length, k, nums);

        if (result != -1) {
            System.out.println("The first element occurring at least " + k + " times is: " + result);
        } else {
            System.out.println("No such element found.");
        }
    }
}

