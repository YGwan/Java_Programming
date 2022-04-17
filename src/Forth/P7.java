/*
원의중심을 나타내는 한점과 반지름을 실수값으로 입력받아라.
그리고 실수값으로 다른점 (x, y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
*/

package Forth;

import java.util.Scanner;

public class P7 {

        public static void main(String[] args) {

                System.out.printf("Input center point & radius >> ");
                Scanner scanner = new Scanner(System.in);
                double center_x = scanner.nextDouble();
                double center_y = scanner.nextDouble();
                double radius = scanner.nextDouble();

                System.out.printf("Input point >> ");
                double point_x = scanner.nextDouble();
                double point_y = scanner.nextDouble();

                double distance = (center_x - point_x)*(center_x - point_x) + (center_y - point_y) *(center_y - point_y);
                distance = Math.sqrt(distance);

                if(distance <= radius) {
                        System.out.println("Point (" +point_x+ ", " + point_y + ") is in the Circle.");;
                }
                else {
                        System.out.println("Point (" +point_x+ ", " + point_y + ") is not in the Circle.");;
                }





        }
}
