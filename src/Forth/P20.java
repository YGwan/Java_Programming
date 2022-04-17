/*
Grade 클래스를 작성해보자. 3과목의 점수를 입력받아 Grade 객체를 생성하고 성적 평균을 출력하는 main() 과 실행 예시는 다음과 같다.
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input scores in order of Math., Science and
        English >> ");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("Average : "+ me.average());
        scanner.close();
        }
        Input scores in order of Math., Science and English >> 90 88 96 Average : 91
*/
package Forth;

import java.util.Scanner;

public class P20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input scores in order of Math, Science and English >> ");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("Average : "+ me.average());
        scanner.close();
    }
}

class Grade {

    int math;
    int science;
    int english;

    public Grade(int math, int science, int english) {

        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int average() {

        int sum = math + science + english;
        int average = sum/3;
        return average;
    }


}
