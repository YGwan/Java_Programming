/*
정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수) 정수 배열을 생성하고,
이곳에 1부터 100까지 범위의 정수를 랜덤하게 저장하라.
배열에는 같은 수가 없도록 하고 저장된 배열을 출력하라(한 줄에 10개씩 출력).
*/
package Forth;

import java.util.Scanner;

public class P15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Number of elements : ");
        int number = scanner.nextInt();
        int[] num = new int[number];

        for (int i = 0; i < number; i++) {
            num[i] = (int) (Math.random() * 100 + 1);
        }

        int index = 0;

        while (true) {

            if (number > 10) {
                for (int j = 0; j < 10; j++) {
                    System.out.printf(num[j+index] + " " );
                    number--;
                }
                index += 10;
                System.out.println();
            } else {
                for (int k = 0; k < number; k++) {
                    System.out.printf(num[k+index] + " ");
                }
                break;
            }
        }
    }
}

