package third;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args){

        //Create an object of Circle class
        Circle c = new Circle();

        Scanner scanner = new Scanner(System.in);

        //Get a double value & save it to radius field of instance c
        c.radius = scanner.nextDouble();

        //Call getArea() method of instance c
        System.out.println(c.getArea());
        scanner.close();
    }
}
