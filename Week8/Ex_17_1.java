package Week8;


import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_17_1 {
    public static void main(String[] args) throws IOException {
        try (
                PrintWriter output = new PrintWriter(new FileWriter("E17_01.txt", true));
        ) {
            for (int i = 0; i < 100; i++) {
                int ran = (int)(Math.random() * 100);
                output.write(ran + " ");
            }
        }
    }
}