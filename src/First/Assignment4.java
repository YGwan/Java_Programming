package First;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int USD = 1100;

        System.out.print("Input KRW : ");
        int money = scanner.nextInt();
        double exchange = money/USD;
        System.out.print(money +" KRW is " + exchange+ " USD.");
        scanner.close();
    }
}