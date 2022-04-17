/*
다음 코드의 comment에 있는 설명대로 Circle 클래스와 CircleManager 클래스를 완성하라
다음 실행 결과와 같이 3개의 Circle 객체 배열을 만들고 x, y, radius 값을 읽어 3개의 Circle 객체를 만든 후,
show()를 이용하여 이들을 모두 출력한다.
*/

package Forth;
import java.util.Scanner;

public class P23 { //CircleManger

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Circle c[] = new Circle[3]; // Circle array with 3 elements
        for(int i=0;i<c.length; i++) {
            System.out.printf("x, y, radius >> ");
            double x = scanner.nextDouble(); // read x
            double y = scanner.nextDouble(); // read y
            int radius = scanner.nextInt(); // read radius
            c[i] = new Circle(x,y,radius); // create Circle object
        }
        for(int i=0;i<c.length;i++) c[i].show(); // Call show() of all

        scanner.close();
    }
}


class Circle {

    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    } //Initialize x, y and radius

    public void show() {
        System.out.println("("+x+", "+y+") r = "+ radius);
    }
}
