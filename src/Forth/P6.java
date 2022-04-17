/*
2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현한다.
(100,100)과 (200,200)의 두 점으로 이루어진 사각형이 있을 때,
Scanner를 이용하여 정수 x와 y값을 입력받고 점 (x, y)가 이 직사각형 안에 있는지를 판별하는 프로그램을 작성하라.
*/

package Forth;

import java.util.Scanner;

public class P6 {

    public static void main(String[] args) {

        System.out.print("Input (x, y) >> ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(checkRec(num1) && checkRec(num2)){
            System.out.println("Point (" +num1+ ", " + num2 + ") is in the rectangle.");
        } else {
            System.out.println("Point (" +num1+ ", " + num2 + ") is not in the rectangle.");
        }

    }

    private static boolean checkRec(int num) {

        if(num>=100 && num <= 200) return true;

        else return false;
    }
}
