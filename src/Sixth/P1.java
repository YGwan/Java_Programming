package Sixth;

import java.io.*;

public class P1 {

//    public static void main(String args[]) {
//
//        byte buffer[] = new byte[1024];
//
//        try {
//            InputStream lenna = new FileInputStream("lenna.png");
//            OutputStream lennaWrite = new FileOutputStream("output.png");
//            int n = lenna.read(buffer);
//            for (int i = 0; i < buffer.length; i++) {
//                lennaWrite.write(buffer,0,n);
//            }
//            lenna.close();
//            lennaWrite.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String args[]) {
        try {
            InputStream lenna = new FileInputStream("lenna.png");
            OutputStream lenna_copy = new FileOutputStream("lenna_copy.png");
            int ch;
            while((ch=lenna.read())!=-1) {
                lenna_copy.write((byte)ch);
            }

            lenna.close();
            lenna_copy.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
