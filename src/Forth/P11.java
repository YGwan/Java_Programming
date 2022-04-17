//정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라.

package Forth;

import java.util.Scanner;

public class P11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input integer >> ");
        int num = scanner.nextInt();

        for(int i = num; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
//            if(i == 1) break;
            System.out.println();
        }
    }
}

class PyramidPrint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input integer >> ");
        int num = scanner.nextInt();

        for(int i =1; i<num; i++) {

            for(int j = num - i; j > 0; j--) {
                System.out.printf(" ");
            }
            for(int k = 0; k < i*2-1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}

