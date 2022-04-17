//다음 main() 메소드의 실행 결과를 참고하여 위 문제의 ColorTV를 상속받는 IPTV 클래스를 작성하라.

package Forth;

public class P29 {

    public static void main(String[] args) {
        IPTV myTV = new IPTV("192.1.1.2", 64, 2047);
        // 192.1.1.2 is IP address
        myTV.printProperty();
    }
}

class IPTV extends ColorTV {

    String ip;
    int inches;
    int colors;

    public IPTV(String ip, int inches, int colors) {
        super(inches, colors);
        this.ip = ip;
        this.inches = inches;
        this.colors = colors;
    }

    @Override
    void printProperty() {
        System.out.println(" My IPTV is "+inches+" inches, " +
                +colors+ " colors and IP address is "+ip);
    }
}
