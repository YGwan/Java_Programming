package Fifth_2;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.Vector;

public class P4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        int rainfall;

        while (true) {
            int sum = 0;
            System.out.print("Enter amount of rainfall (0 to quit)>> ");
            rainfall = scanner.nextInt();
            if(rainfall == 0) break;
            v.add(rainfall);

            for(int index = 0; index < v.size(); index++) {
                int num = v.get(index);
                sum += num;
                System.out.print(num + " ");
            }
            System.out.println(v.size());
            System.out.println("\nCurrent Average : " + sum/v.size());
        }
    }
}
