/*
다음 main() 메소드를 실행하였을 때, 예시와 같이 출력되도록 TV 클래스를 작성하라.
public static void main(String[] args) {
        TV myTV = new TV("LG", 2021, 85);
        myTV.show();
      }
        My TV is 85 inches manufactured by LG in 2021.
        */
package Forth;

public class P19 {

    public static void main(String[] args) {
        TV myTV = new TV("LG", 2021, 85);
        myTV.show();
    }
}

class TV {
    String brand;
    int year;
    int inch;

    public TV(String brand, int year, int inch) {
        this.brand = brand;
        this.year = year;
        this.inch = inch;
    }

    public void show() {
        System.out.println("My Tv is " + inch + " inches manufactured by " + brand + " in " + year);
    }
}
