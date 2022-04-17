/*
Scanner class를 이용하여 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
*/
package Forth;

import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {

        int num1, num2, num3, max, middleNum;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Input 3 integers >> ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            num3 = scanner.nextInt();

            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Duplicate has occurred!! Please enter it again.");
            }
            else break;
        }

        //제일 큰 값 구하기
        max = Math.max(num1, num2);
        max = Math.max(max, num3);

        if(num1 == max) middleNum = Math.max(num2, num3);
        else if(num2 == max) middleNum = Math.max(num1, num3);
        else middleNum = Math.max(num1, num2);

        System.out.println("Middle number is " + middleNum);
        scanner.close();
    }
}
