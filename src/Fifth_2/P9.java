package Fifth_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class P9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> pointMap = new HashMap<String, Integer>();

        System.out.println("** REWARD Management System **");

        while (true) {
            System.out.print("Enter name & reward point >> ");
            String name = scanner.next();
            if (name.equals("exit"))
                break;
            int point = scanner.nextInt();

            Integer num = pointMap.get(name);
            if (num != null) {
                point += num;
            }

            pointMap.put(name, point);
            Set<String> key = pointMap.keySet();
            Iterator<String> iterator = key.iterator();

            while (iterator.hasNext()) {
                String correctName = iterator.next();
                int correctPoint = pointMap.get(correctName);
                System.out.print("(" + correctName + "," + correctPoint + ") ");
            }
            System.out.println();
        }
    }

}
