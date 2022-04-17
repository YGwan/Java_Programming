package Second;

public class Assignment4 {

    public static void main(String[] args){

        for(int row = 1; row<=9; row++){
            for(int col =2; col<=9; col++){
                System.out.print(col+"*"+row+"="+col*row+"\t");
            }
            System.out.println();
        }
    }

}
