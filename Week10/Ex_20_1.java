package Week10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Ex_20_1 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java E20_01 filename.txt");
            System.exit(1);
        }

        File textFile = new File(args[0]);

        if (!textFile.exists()) {
            System.out.println("File " + textFile.getName() + " does not exist");
            System.exit(2);
        }

        if (!textFile.isFile()) {
            System.out.println(textFile.getName() + " is a directory");
            System.exit(3);
        }

        try (
                Scanner input = new Scanner(textFile);
        ) {
            PriorityQueue<String> queue = new PriorityQueue<>();
            while (input.hasNext()) {
                queue.offer(input.next());
            }

            while (queue.size() > 0) {
                System.out.println(queue.poll());
            }
        }
    }
}