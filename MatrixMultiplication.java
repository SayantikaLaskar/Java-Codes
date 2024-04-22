public class MatrixMultiplication {
    
    public static int[][] multiply(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        
        int[][] result = new int[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        return result;
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] A = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] B = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        int[][] result = multiply(A, B);

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Matrix B:");
        printMatrix(B);

        System.out.println("Result of matrix multiplication:");
        printMatrix(result);
    }
}
