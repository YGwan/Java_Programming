/*
정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
그리고 배열에 든 숫자들과 평균값을 출력하라.
*/
package Forth;


public class P14 {

    public static void main(String[] args) {

        int[] num = new int[10];
        int sum = 0;

        for(int i = 0; i < 10; i++) {
            int number = (int)(Math.random()*10 +1);
            num[i] = number;
        }
        System.out.printf("Random numbers :");

        for(int k = 0; k < 10; k++) {
            sum = sum + num[k];
            System.out.printf(" " + num[k]);
        }

        double average = sum/10;
        System.out.printf("\nAverage : "+ average);

    }
}
