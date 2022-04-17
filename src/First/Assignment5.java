package First;

import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input integer(10~99) : ");
        int num = scanner.nextInt();
        int num10 = num/10;
        int num1 = num%10;
        if(num10 == num1){
            System.out.println("Yes! " +num10+" & "+num1+" are same.");
        }
        else{
            System.out.println("No! " +num10+" & "+num1+" are not same.");
        }
        scanner.close();
    }
}
