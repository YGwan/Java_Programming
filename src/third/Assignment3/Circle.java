package third.Assignment3;

public class Circle {
    public double radius;

    public  Circle(double val) {
        radius = val;
    }

    public double getArea() {
        double area = 3.14 * radius * radius;
        return  area;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(6.0);

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
    }
}
