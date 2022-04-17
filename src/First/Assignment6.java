package First;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input integer(10~99) : ");
        int num = scanner.nextInt();
        int num10 = num / 10;
        int num1 = num % 10;
        int count = 0;

        if (num1 % 3 == 0) count = count + 1;

        if (num10 % 3 == 0) count = count + 1;

        for (int i = 0; i < count; i++) {
            System.out.print("Clap");

            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        scanner.close();
    }
}
