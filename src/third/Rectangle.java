package third;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        double area = width * height;
        return  area;
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.0, 6.0);
        System.out.println(rectangle.getArea());
    }



}
