package Week11;


import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Ex_21_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (0 terminates input): ");
        TreeMap<Integer, Integer> numFrequency = new TreeMap<>();
        while (true) {
            int num = input.nextInt();
            if (num == 0) { break; }
            if (numFrequency.containsKey(num)) {
                numFrequency.replace(num, numFrequency.get(num) + 1);
            } else {
                numFrequency.put(num, 1);
            }
        }

        int max = findMaxValue(numFrequency);

        System.out.println("The most frequent numbers were: ");
        for (Map.Entry<Integer, Integer> e: numFrequency.entrySet()) {
            if (e.getValue() == max) {
                System.out.println(e.getKey());
            }
        }
    }

    public static int findMaxValue(TreeMap<Integer, Integer> map) {
        int max = map.firstEntry().getValue();

        for (Map.Entry<Integer, Integer> e: map.entrySet()) {
            if (e.getValue() > max) { max = e.getValue(); }
        }

        return max;
    }
}