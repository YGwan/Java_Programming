package Second;

import java.util.Scanner;

public class Assignment1  {

    public static void main(String[] args){

        int arr[] = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer value(>0)");

        for(int i=0; i<arr.length; i++){
            int num = scanner.nextInt();
            arr[i] = num;
            if(num <= 0) {
                System.out.println(num + " is invalid");
                i--;
            }
        }

        int max = arr[0];

        for(int k =0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
            if(arr[k] > max){
                max = arr[k];
            }
        }
        System.out.println("--> Maximum value is "+ max);
    }
}
