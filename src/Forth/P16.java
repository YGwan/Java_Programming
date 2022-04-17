/*
4x4의 2차원배열을 만들고 이곳에 1부터 10까지 범위의 정수를 랜덤하게 생성하여
정수 16개를 배열에 저장하고 2차원 배열을 화면에 출력하라.
*/
package Forth;

public class P16 {

    public static void main(String[] args) {
        int[][] num = new int[4][4];

        for(int i=0; i < num.length; i++) {
            for(int j=0; j < num[i].length; j++) {
                num[i][j] = (int)(Math.random()*10 + 1);
                System.out.printf(num[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
