class PeakElement {
    public int findPeakElement(int[] arr, int n) {
        int i = 0, j = n - 1;

        while (i < j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // If mid element is greater than its right neighbor, a peak might be on the left side
                j = mid;
            } else {
                // If mid element is less than or equal to its right neighbor, a peak might be on the right side
                i = mid + 1;
            }
        }

        return i; // or j, both are now representing a potential peak element
    }

    public static void main(String[] args) {
        PeakElement peakElementFinder = new PeakElement();
        int[] arr = {1, 3, 20, 4, 1, 0};
        int n = arr.length;

        int peakIndex = peakElementFinder.findPeakElement(arr, n);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }
}

