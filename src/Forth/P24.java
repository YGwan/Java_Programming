//앞의 Circle과 CircleManager 클래스를 수정하여 다음 실행 결과와 같이 출력하도록 하라.
package Forth;

import java.util.Scanner;

public class P24 {
    //CircleManger

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Forth.Circle2 c[] = new Forth.Circle2[3]; // Circle array with 3 elements
        for (int i = 0; i < c.length; i++) {
            System.out.printf("x, y, radius >> ");
            double x = scanner.nextDouble(); // read x
            double y = scanner.nextDouble(); // read y
            int radius = scanner.nextInt(); // read radius
            c[i] = new Forth.Circle2(x, y, radius); // create Circle object
        }

        int LargeIndex = 0;

        for (int index = 0; index < c.length; index++) {
            int LargeRadius = c[0].radiusValue();
            if(LargeRadius < c[index].radiusValue()) {
                LargeRadius = c[index].radiusValue();
                LargeIndex = index;
            }
            System.out.println();
        }
        c[LargeIndex].show();
        scanner.close();
    }
}


class Circle2 {

    private double x, y;
    private int radius;

    public Circle2(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    } //Initialize x, y and radius

    public void show() {
        System.out.println("Biggest circle info is ("+x+", "+y+") r = "+ radius);
    }

    public int radiusValue() {
        return radius;
    }
}


