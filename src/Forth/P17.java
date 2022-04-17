/*
4x4의 2차원배열을 만들고 이곳에 1부터 10까지 범위의 정수를 10개만 랜덤하게 생성하여
임의의 위치에 저장하라. 나머지 6개의 숫자는 모두 0으로 저장한다.
2차원 배열을 화면에 출력하라.
*/
package Forth;

public class P17 {

    public static void main(String[] args) {
        int[][] num = new int[4][4];

        //랜덤한 배열 생성
        for(int i=0; i < num.length; i++) {
            for(int j=0; j < num[i].length; j++) {
                num[i][j] = (int)(Math.random()*10 + 1);
            }
        }

        //랜덤한 위치에다가 0 대입
        for(int j=0; j<6; j++) {
            int row = (int)(Math.random()*4);
            int col = (int)(Math.random()*4);

            if(num[row][col] == 0) {
                j--;
            } else {
                num[row][col] = 0;
            }
        }

        //해당 배열 출력
        for(int i=0; i < num.length; i++) {
            for(int j=0; j < num[i].length; j++) {
                System.out.printf(num[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
