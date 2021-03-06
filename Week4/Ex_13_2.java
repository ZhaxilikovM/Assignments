package Week4;

import java.util.ArrayList;

public class Ex_13_2 {
    public static void main(String[] args) {
        // generate ordered list of Number objects
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }

        displayList(list);

        // shuffle the list
        shuffle(list);

        displayList(list);

    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int)(Math.random() * list.size());
            Number temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }

    public static void displayList(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
