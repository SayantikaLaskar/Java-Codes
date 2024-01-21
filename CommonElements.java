import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public static List<Integer> findCommonElements(List<Integer> V1, List<Integer> V2) {
        List<Integer> result = new ArrayList<>();

        // Sort the lists
        V1.sort(Integer::compareTo);
        V2.sort(Integer::compareTo);

        int i = 0, j = 0;

        // Iterate through both lists to find common elements
        while (i < V1.size() && j < V2.size()) {
            int num1 = V1.get(i);
            int num2 = V2.get(j);

            if (num1 == num2) {
                result.add(num1);
                i++;
                j++;
            } else if (num1 < num2) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        List<Integer> V1 = Arrays.asList(1, 2, 2, 1);
        List<Integer> V2 = Arrays.asList(2, 2);

        List<Integer> commonElements = findCommonElements(V1, V2);

        System.out.println("Common Elements: " + commonElements);
    }
}

