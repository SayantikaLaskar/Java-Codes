import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class FractionalKnapsack {

    public static double getMaxValue(Item[] items, int capacity) {
        Arrays.sort(items, Comparator.comparingDouble(item -> (double) item.value / item.weight).reversed());

        double totalValue = 0.0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                totalValue += item.value;
                currentWeight += item.weight;
            } else {
                double remainingCapacity = capacity - currentWeight;
                totalValue += (item.value / (double) item.weight) * remainingCapacity;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item(10, 60),
                new Item(20, 100),
                new Item(30, 120)
        };

        int capacity = 50;

        double maxValue = getMaxValue(items, capacity);

        System.out.println("Maximum value in knapsack: " + maxValue);
    }
}




