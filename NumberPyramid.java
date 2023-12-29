import java.util.*;

public class NumberPyramid {

    public static void main(String[] args) {
        int numRows = 5;

        // Print the number pyramid
        for (int i = 1; i <= numRows; i++) {
            // Print spaces before the numbers
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Print decreasing numbers
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
