/*
원의 중심을 나타내는 한 점과 반지름을 입력받는다.
두개의 원에 대한 정보를 입력받고 두 원이 서로 겹치는지 판단하여 출력하다.
*/

package Forth;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input center and radius of 1st circle >> ");
        double first_x = scanner.nextDouble();
        double first_y = scanner.nextDouble();
        double first_radius = scanner.nextDouble();

        System.out.printf("Input center and radius of 2nd circle >> ");
        double second_x = scanner.nextDouble();
        double second_y = scanner.nextDouble();
        double second_radius = scanner.nextDouble();

        double totalRadius = first_radius + second_radius;
        double distance = (first_x - second_x) * (first_x - second_x) + (first_y - second_y) * (first_y - second_y);
        distance = Math.sqrt(distance);

        if(distance <= totalRadius) {
            System.out.println("Two circles are overlapped");
        }
        else
            System.out.println("Two circles are not overlapped");
    }
}
