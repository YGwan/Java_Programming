/*
사칙연산을 입력받아 계산하는 프로그램을 작성하라.
연산자는 +,-,*,/의 네가지로 하고 피연산자는 모두 double형 실수로 한다.
피연산자와 연산자는 아래 예제와 같이 빈 칸 (Space)로 구분하여 입력한다.
0으로 나누기시 “Divide by 0 error”를 출력한다
*/
package Forth;

import java.util.Scanner;

public class P10 {

    public static void main(String[] args) {

        System.out.printf("Enter >> ");
        Scanner scanner = new Scanner(System.in);

        double operand1 = scanner.nextDouble();
        String operator = scanner.next();
        double operand2 = scanner.nextDouble();
        double result;

        if(operator.equals("+")) {
            result = operand1 + operand2;
            System.out.println(operand1 + " + " + operand2 + " = " + result);
        } else if(operator.equals("-")) {
            result = operand1 - operand2;
            System.out.println(operand1 + " - " + operand2 + " = " + result);
        } else if(operator.equals("*")) {
            result = operand1 * operand2;
            System.out.println(operand1 + " * " + operand2 + " = " + result);
        } else if(operator.equals("/")){
            if(operand2 == 0) {
                System.out.println("Divide by 0 error");
            }
            else {
                result = operand1/operand2;
                System.out.println(operand1 + " / " + operand2 + " = " + result);
            }
        }
    }
}
