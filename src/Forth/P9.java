/*
숫자를 입력받아 3~5는 “Spring", 6~8은 “Summer”, 9~11 은 “Autumn”, 12,1 또는 2는 “Winter”를 출력하고
그 외의 숫자를 입력한 경우 “Invalid”를 출력하는 프로그램을 작성하라.
*/
package Forth;

import java.util.Scanner;

public class P9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input month (1~12) >> ");
        int num = scanner.nextInt();

        if (num >= 1 && num <= 2) {
            System.out.println("Winter");
        } else if (num >= 3 && num <= 5) {
            System.out.println("Spring");
        } else if (num >= 6 && num <= 8) {
            System.out.println("Summer");
        } else if (num >= 9 && num <= 11) {
            System.out.println("Autumn");
        } else if (num == 12) {
            System.out.println("Winter");
        } else {
            System.out.println("Invalid");
        }

    }
}
