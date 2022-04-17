/*
다음 멤버를 가지고 직사각형을 표현하는 Rectangle 클래스를 작성하라.
        ● int 타입의 x, y, width, height 필드 : 사각형을 구성하는 점과 크기 정보 (x, y)는
        사각형의 좌상단 꼭지점의 좌표로 한다.
        ● x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
        ● int square() : 사각형 넓이 리턴
        ● void show() : 사각형의 좌표와 넓이를 화면에 출력
        ● boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
        ● main() 메소드의 코드와 실행 결과는 다음과 같다.
*/

package Forth;

public class P22 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);
        r.show();
        System.out.println("Area : "+ s.square());
        if(t.contains(r)) System.out.println("t includes r");
        if(t.contains(s)) System.out.println("t includes s");
    }
}

class Rectangle {

    int x;
    int y;
    int width;
    int height;

    public Rectangle(int x, int y, int xidth, int height) {
        this.x = x;
        this.y = y;
        this.width = xidth;
        this.height = height;
    }

    public int square() {
        return width * height;
    }

    public void show() {
        System.out.println("Rectangle at ("+x+","+y+") with area "+ width *height);
    }

    public boolean contains(Rectangle r) {
        if(x < r.x && y < r.y)
            if(((x + width) > (r.x+r.width)) && ((y + height) > (r.y+r.height)))
                return true;
        return false;
    }
}
