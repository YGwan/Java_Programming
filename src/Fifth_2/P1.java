package Fifth_2;

import java.util.Scanner;
import java.util.Vector;

/*
* Write a program to find the maximum value.
a. Use Scanner class to get positive integers until user input -1.
b. Save all input numbers in Vector
c. Search maximum number and print it
*/
public class P1 {

    public static void main(String[] args) {

        int max;
        int num;
        int num1;

        Scanner scanner = new Scanner(System.in);

        Vector<Integer> v = new Vector<Integer>();

        System.out.print("Enter integer(-1 to quit)>> ");

        max = 0;
        while (true) {
            num = scanner.nextInt();

            if(num == -1) {
                for(int i=1; i< v.size(); i++) {
                    num1 = v.get(i);
                    if (num1 > max) max = num1;
                }
                System.out.println("Maximum number is " + max);
                break;
            }
            else {
                v.add(num);

            }
        }
    }

}
