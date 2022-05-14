package Fifth;



class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle with radius "+ radius);
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}

public class P4 {
    public static void main(String[] args) {
        Shape donut = new Circle(10); // Radius is 10
        donut.redraw();
        System.out.println("Area : "+ donut.getArea());
    }

}
