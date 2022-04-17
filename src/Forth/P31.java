package Forth;

public class P31 {

    public static void main(String[] args) {
        P31_ColorPoint zeroPoint = new P31_ColorPoint(); // Set BLACK on (0, 0)
        System.out.println(zeroPoint.toString());
        P31_ColorPoint cp = new P31_ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString());
    }
}

class P31_ColorPoint extends Point{
    private int x = 0;
    private int y = 0;
    String color = "black";

    public P31_ColorPoint() {
        super(0, 0);
    }

    public P31_ColorPoint(int x, int y) {
        super(x, y);
    }


    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color+" color on ("+x+", "+y+")";
    }
}
