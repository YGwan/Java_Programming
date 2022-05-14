package Fifth;

import java.util.Scanner;


class Won2Dollar extends Converter {

    public Won2Dollar(double ratio) {
        this.ratio = ratio;
    }

    @Override
    protected double convert(double src) {
        return src/ratio;
    }

    @Override
    protected String getSrcString() {
        return "KRW";
    }

    @Override
    protected String getDestString() {
        return "USD";
    }
}

public class P1 {
    public static void main(String[] args) {
        Won2Dollar toDollar = new Won2Dollar(1200.0);
        toDollar.run();
    }

}



