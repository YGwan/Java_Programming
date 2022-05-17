package Sixth;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class P2 {

    public static void main(String args[]) {

        byte buffer[] = new byte[1024];

        try {
            InputStream lenna = new FileInputStream("lenna.png");
            OutputStream lennaWrite = new FileOutputStream("output.png");

            int n;
            while ((n = lenna.read(buffer)) != -1) {
                lennaWrite.write(buffer,0,n);
            }
            lenna.close();
            lennaWrite.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



