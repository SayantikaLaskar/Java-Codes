public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // At least one unique element (the first one)
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int uniqueCount = removeDuplicates(nums);

        System.out.println("Unique elements count: " + uniqueCount);
        System.out.print("Unique elements: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

    
        
