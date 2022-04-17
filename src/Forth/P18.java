/*
다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라
        String course[] = {"Java", "C++", "HTML","Kotlin","Python"};
        int score[] = {95, 88, 76, 62, 55};
        그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. 과목명에 “Quit”를 입력하면 프로그램을 종료한다.
*/

package Forth;

import java.util.Scanner;

public class P18 {

    public static void main(String[] args) {

        String course[] = {"Java", "C++", "HTML","Kotlin","Python"};
        int score[] = {95, 88, 76, 62, 55};
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.printf("Subject >> ");
            String subject = scanner.next();

            if(subject.equals("Quit")) break;

            switch (subject) {
                case  "Java":
                    System.out.println("Score is " + score[0] );
                    break;

                case  "C++":
                    System.out.println("Score is " + score[1] );
                    break;

                case  "HTML":
                    System.out.println("Score is " + score[2] );
                    break;

                case  "Kotlin":
                    System.out.println("Score is " + score[3] );
                    break;

                case  "Python":
                    System.out.println("Score is " + score[4] );
                    break;
            }
        }
    }
}
