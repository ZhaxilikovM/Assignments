package Week8;


import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_17_2 {
    public static void main(String[] args) throws IOException {
        try (
                DataOutputStream output =
                        new DataOutputStream(
                                new BufferedOutputStream(new FileOutputStream("E17_02.dat", true)));
        ) {
            for (int i = 0; i < 100; i++) {
                int ran = (int)(Math.random() * 100);
                output.writeInt(ran);
            }
        }
    }
}
