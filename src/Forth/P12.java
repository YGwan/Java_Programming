/*
소문자 알파벳을 입력 받고 다음과 같이 출력하는 프로그램을 작성하라.
*/

package Forth;

import java.util.Scanner;

public class P12 {

    public static void main(String[] args) {

        System.out.printf("Input a lowercase alphabet >> ");
        Scanner scanner = new Scanner(System.in);
        int asc;

        String alpha = scanner.next();
        char alphabet = alpha.charAt(0);
        asc = (int) alphabet; // a = 97, z = 122
        printLoop(asc);

    }


    //e가 들어옴
    static void printLoop(int a) {

        int temp = a - 97;
        for (int i = 0; i <= temp; i++) {
            for (int j = 97; j <= a; j++) {
                String alp = Character.toString(j);
                System.out.printf(alp);
            }
            a--;
            System.out.println();
        }
    }
}


