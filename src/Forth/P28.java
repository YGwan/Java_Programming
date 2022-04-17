package Forth;

public class P28 {

    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(64, 1024);
        myTV.printProperty();
    }

}


class P28_TV {
    private int size;
    public P28_TV(int size) { this.size = size; }
    protected int getSize() { return size; }
}

class ColorTV extends P28_TV {

    private int inches;
    private int colors;

    public ColorTV(int inches, int colors) {
        super(inches);
        this.inches = inches;
        this.colors = colors;
    }

    void printProperty() {
        System.out.println(inches + " inches, "+colors+ " colors");
    }
}
