/*
간단한 369 게임 프로그램을 작성하라. 조건은 다음과 같다.
        a. 1부터 99까지의 정수를 입력받아 10의 자리 수와 1의 자리 수를 검사한다.
        b. ‘3’, ‘6’, ‘9’ 숫자 하나가 있다면 “Clap”을 출력한다.
        c. ‘3’, ‘6’, ‘9’ 숫자 두개가 있다면 “Clap, Clap”을 출력한다.
        d. 그렇지 않으면 프로그램을 종료한다.
*/
package Forth;

import java.util.Scanner;

public class P5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Input integer(10~99) : ");
            num = scanner.nextInt();
            if (num < 10 || num > 99) {
                System.out.println("Check again to see if the input is an integer (10-99)");
            } else break;
        }
        Clap c = new Clap();
        c.printClap(num);
        scanner.close();
    }
}

class Clap {
    public void printClap(int num) {

        int num10 = num / 10;
        int num1 = num % 10;
        int count = 0;

        if (num1 % 3 == 0) count = count + 1;

        if (num10 % 3 == 0) count = count + 1;

        for (int i = 0; i < count; i++) {
            System.out.print("Clap");

            if (i < count - 1) {
                System.out.print(", ");
            }
        }
    }
}
