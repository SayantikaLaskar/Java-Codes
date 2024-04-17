import java.util.Scanner;

public class spiralPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        int value = 1;
        int topRow = 0, bottomRow = rows - 1, leftCol = 0, rightCol = cols - 1;
        
        while (topRow <= bottomRow && leftCol <= rightCol) {

            for (int i = leftCol; i <= rightCol; i++) {
                matrix[topRow][i] = value++;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow; i++) {
                matrix[i][rightCol] = value++;
            }
            rightCol--;

            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    matrix[bottomRow][i] = value++;
                }
                bottomRow--;
            }
            

            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    matrix[i][leftCol] = value++;
                }
                leftCol++;
            }
        }

        System.out.println("Spiral Pattern:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
