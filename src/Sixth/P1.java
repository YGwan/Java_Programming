package Sixth;

import java.io.*;

public class P1 {

    public static void main(String[] args) {

        byte b[] = new byte[1];

        try {

            InputStream fileInputStream = new FileInputStream("lenna.png");
            OutputStream fileOutput = new FileOutputStream("output.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutput, "EUC-KR");


            fileInputStream.read(b);
            for (int i=0; i<b.length; i++){
                String data = String.format("%02X ", b[i]);
                System.out.print(data);
                outputStreamWriter.write(data);
            }

            fileInputStream.close();
            outputStreamWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
