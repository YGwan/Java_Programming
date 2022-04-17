// 하루 할 일을 표현하는 클래스 Day는 다음과 같다. 한 달의 할 일을 표현하는 MonthSchedule 클래스를 작성하라.

package Forth;

import java.util.Scanner;

public class P25 {

    public static void main(String[] args) { //MonthSchedule

        Scanner scanner = new Scanner(System.in);
        System.out.println("Monthly schedule management system");


        Day days[] = new Day[31];

        for(int index = 0; index < 31; index++) {
            days[index] = new Day();
        }

        while (true) {

            System.out.printf("Todo (Input:1, Show:2, Quit:3) >> ");
            int choose = scanner.nextInt();



            if (choose == 1) {
                System.out.printf("Date(1-30) : ");
                int date = scanner.nextInt();
                System.out.printf("Todo(Enter string without space) ? ");
                String schedule = scanner.next();
                days[date].set(schedule);
            }
            else if (choose == 2) {
                System.out.printf("Date(1-30) : ");
                int date = scanner.nextInt();
                days[date].show();
            }
            else if(choose == 3) {
                System.out.println("Quit program.");
                break;
            }
        }
        scanner.close();
    }
}

class Day {

    private String todo;
    public void set(String todo) { this.todo = todo; }
    public String get() { return todo; }
    public void show() {
        if(todo == null) System.out.println("Nothing to do");
        else System.out.println(todo);
    }
}