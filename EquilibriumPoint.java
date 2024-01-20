public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};

        int equilibriumIndex = findEquilibrium(arr);

        if (equilibriumIndex != -1) {
            System.out.println("The first equilibrium point is at index: " + equilibriumIndex);
        } else {
            System.out.println("There is no equilibrium point in the array.");
        }
    }

    static int findEquilibrium(int[] arr) {
        int n = arr.length;

        // Calculate the total sum of the array
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        // Initialize leftSum to 0
        int leftSum = 0;

        // Traverse the array and find the equilibrium point
        for (int i = 0; i < n; i++) {
            // Reduce totalSum by the current element
            totalSum -= arr[i];

            // If leftSum is equal to the remaining totalSum, we found the equilibrium point
            if (leftSum == totalSum) {
                return i; // Return the index of equilibrium point
            }

            // Add the current element to leftSum for the next iteration
            leftSum += arr[i];
        }

        // No equilibrium point found
        return -1;
    }
}

