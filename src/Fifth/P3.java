package Fifth;


import java.util.Scanner;

abstract class Calc {
    protected int a;
    protected int b;
    abstract protected void setValue();
    abstract int calculate();
}

class Add extends Calc {

    String operand1;
    String operand2;

    public Add(String operand1, String operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    protected void setValue() {
        this.a = Integer.parseInt(operand1);
        this.b = Integer.parseInt(operand2);
    }

    @Override
    int calculate() {
        return a+b;
    }
}
class Sub extends Calc {

    String operand1;
    String operand2;

    public Sub(String operand1, String operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    protected void setValue() {
        this.a = Integer.parseInt(operand1);
        this.b = Integer.parseInt(operand2);
    }

    @Override
    int calculate() {
        return a-b;
    }
}
class Mul extends Calc {

    String operand1;
    String operand2;

    public Mul(String operand1, String operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    protected void setValue() {
        this.a = Integer.parseInt(operand1);
        this.b = Integer.parseInt(operand2);
    }

    @Override
    int calculate() {
        return a*b;
    }
}
class Div extends Calc {

    String operand1;
    String operand2;

    public Div(String operand1, String operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    protected void setValue() {
        this.a = Integer.parseInt(operand1);
        this.b = Integer.parseInt(operand2);
    }

    @Override
    int calculate() {
        return a/b;
    }
}
public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 operands & operator >>> ");
        String operand1 = scanner.next();
        String operator = scanner.next();
        String operand2 = scanner.next();

        switch (operator) {
            case "+" -> {
                Add add = new Add(operand1, operand2);
                add.setValue();
                System.out.println(add.calculate());
            }
            case "-" -> {
                Sub sub = new Sub(operand1, operand2);
                sub.setValue();
                System.out.println(sub.calculate());
            }
            case "*" -> {
                Mul mul = new Mul(operand1, operand2);
                mul.setValue();
                System.out.println(mul.calculate());
            }
            case "/" -> {
                try {
                    Div div = new Div(operand1, operand2);
                    div.setValue();
                    System.out.println(div.calculate());
                } catch (ArithmeticException e) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }

            }
        }
    }
}
