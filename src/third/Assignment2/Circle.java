package third.Assignment2;

import java.util.Scanner;

public class Circle {
    public double radius;

    public Circle() {
        radius = 3.0;
    }

    public double getArea() {
        double area = 3.14 * radius * radius;
        return  area;
    }

    public static void main(String[] args){
        Circle c = new Circle();
        Scanner scanner = new Scanner(System.in);

        System.out.println(c.getArea());

        c.radius = scanner.nextDouble();
        System.out.println(c.getArea());
        scanner.close();
    }
}
