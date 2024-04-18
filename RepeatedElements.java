import java.util.Arrays;

class RepeatedElements {
    public int[] findTwoRepeated(int arr[], int n) {
        // Sort the array
        Arrays.sort(arr);
        
        // Initialize an array to store repeated elements
        int[] repeated = new int[2];
        int index = 0;
        
        // Traverse the sorted array to find repeated elements
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeated[index++] = arr[i];
                i++; // Skip the next element as it is also repeated
            }
        }
        
        return repeated;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 4, 5};
        int n = arr.length;
        
        RepeatedElements repeatedElements = new RepeatedElements();
        int[] result = repeatedElements.findTwoRepeated(arr, n);

        System.out.println("Two repeated elements are: " + result[0] + " and " + result[1]);
    }
}
