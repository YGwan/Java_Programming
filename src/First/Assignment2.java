package First;

public class Assignment2 {
    public static void main(String[] args) {
        int a = 5, b = 20, c = 0xfffffff8;
        int d, e;
        a = a << 2;
        b = b >> 2;
        //빈자리에 1을 채움
        d = c >> 2;
        //빈자리에 0을 채움
        e = c >>> 2;
        System.out.println(a + ", " +b+ ", " +d+ ", " +e);
    }
}
