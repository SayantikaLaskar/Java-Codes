import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 9; ++i) {
            int num = i;
            int nextDigit = i + 1;

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;
                if (low <= num && num <= high) {
                    result.add(num);
                }
                ++nextDigit;
            }
        }

        result.sort(null);
        return result;
    }

    public static void main(String[] args) {
        SequentialDigits sequentialDigits = new SequentialDigits();

        int low = 100;
        int high = 3000;

        List<Integer> result = sequentialDigits.sequentialDigits(low, high);

        System.out.println("Sequential digits between " + low + " and " + high + ":");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

