/*
양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
*/
package Forth;

import java.util.Scanner;

public class P13 {

    public static void main(String[] args) {

        int[] num = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input 10 positive integers >> ");
        for(int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            num[i] = number;
        }

        System.out.printf("Multiples of 3 :");

        for(int k = 0; k < 10; k++) {
            if(num[k] % 3 == 0) {
                System.out.printf(" " + num[k]);
            }
        }


    }
}
