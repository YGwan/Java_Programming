/*
Scanner class를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력 받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라.
삼각형이 되려면 두 변의 합이 다른 한 변의 길이보다 커야 한다.
*/
package Forth;

import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {

        int num1, num2, num3, max;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input 3 integers >> ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        //제일 큰 값 구하기
        max = Math.max(num1, num2);
        max = Math.max(max, num3);

        if (num1 == max) {
            if ((max < num2 + num3)) {
                System.out.println("YES!");
            } else {
                System.out.println("No!");
            }
        }
        if (num2 == max) {
            if ((max < num1 + num3)) {
                System.out.println("YES!");
            } else {
                System.out.println("No!");
            }
        }
        if (num3 == max) {
            if ((max < num1 + num2)) {
                System.out.println("YES!");
            } else {
                System.out.println("No!");
            }
        }
        scanner.close();
    }
}
