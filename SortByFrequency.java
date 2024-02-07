import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((x, y) -> map.get(y) - map.get(x));
        for (char c : map.keySet()) {
            pq.offer(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.poll();
            for (int i = 0; i < map.get(ch); i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String inputString = "tree";
        String result = frequencySort(inputString);
        System.out.println("Input: " + inputString);
        System.out.println("Sorted by Frequency: " + result);
    }
}
