package Fifth;

class Rect implements Shape {

    double height;
    double width;

    public Rect(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with size " +height +" X "+ width);
    }

    @Override
    public double getArea() {
        return height*width;
    }

}
public class P5 {
    public static void main(String[] args) {
        Shape [] list = new Shape[2];
        list[0] = new Circle(10);     // Circle with Radius 10
        list[1] = new Rect(10, 40);   // 10 x 40 Rectangle
        for(int i=0;i<list.length;i++) list[i].redraw();

        for(int i=0;i<list.length;i++)
            System.out.println("Area : "+ list[i].getArea());
    }
}
