/*
Scanner 클래스를 이용하여 2자리의 정수(10~99 사이)를 입력받고,
10의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라.
*/
package Forth;

import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        
        System.out.print("Input integer(10~99) : ");
        num = scanner.nextInt();
        System.out.println("Check again to see if the input is an integer (10-99)");

        int num10 = num / 10;
        int num1 = num % 10;
        if (num10 == num1) {
            System.out.println("Yes! The digits of 10 and the digits of 1 are the same.");
        } else {
            System.out.println("No! The digits of 10 and the digits of 1 are different.");
        }
        scanner.close();
    }
}
