public class LargestLocalValuesInMatrix {
    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n - 2][n - 2];
        for (int i = 1; i < n - 1; ++i) {
            for (int j = 1; j < n - 1; ++j) {
                int temp = 0;
                for (int k = i - 1; k <= i + 1; ++k) {
                    for (int l = j - 1; l <= j + 1; ++l) {
                        temp = Math.max(temp, grid[k][l]);
                    }
                }
                res[i - 1][j - 1] = temp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        int[][] largestLocals = largestLocal(grid);

        // Printing the largest local values
        System.out.println("Largest Local Values:");
        for (int i = 0; i < largestLocals.length; i++) {
            for (int j = 0; j < largestLocals[i].length; j++) {
                System.out.print(largestLocals[i][j] + " ");
            }
            System.out.println();
        }
    }
}
