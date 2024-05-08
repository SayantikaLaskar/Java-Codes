import java.util.*;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] scores = {5, 10, 8, 3, 15};
        RelativeRanks solution = new RelativeRanks();
        String[] result = solution.findRelativeRanks(scores);
        
        System.out.println("Relative Ranks:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + ": " + result[i]);
        }
    }

    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : score) {
            pq.offer(i);
        }
        Map<Integer, String> map = new HashMap<>();
        int index = 1;
        while (!pq.isEmpty()) {
            if (index == 1) {
                map.put(pq.remove(), "Gold Medal");
            } else if (index == 2) {
                map.put(pq.remove(), "Silver Medal");
            } else if (index == 3) {
                map.put(pq.remove(), "Bronze Medal");
            } else {
                map.put(pq.remove(), Integer.toString(index));
            }
            index++;
        }
        String[] res = new String[score.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = map.get(score[i]);
        }
        return res;
    }
}
