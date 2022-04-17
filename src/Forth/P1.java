/*
Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 표시하는 프로그램을 작성하시오.
1 USD = 1100 KRW로 가정하고 계산하라.
*/
package Forth;

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double USD = 1100;

        System.out.print("Input KRW : ");
        int money = scanner.nextInt();
        double exchange = money / USD;
        System.out.print(money + " KRW is " + Math.round(exchange * 100) / 100.0 + " USD."); //1100으로 나누어떨어지지 않을경우 소수점 2번째 자리까지 출력한다.
        scanner.close();
    }
}
