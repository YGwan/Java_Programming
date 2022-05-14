package Fifth_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class P8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> scoreHashMap = new HashMap<>();
        System.out.println("DK Scholarship management system.");

        for(int i=0; i<5; i++) {
            System.out.print("name & grade >> ");
            String name = scanner.next();
            double score = scanner.nextDouble();
            scoreHashMap.put(name,score);
        }

        System.out.print("Input grade limitation >> ");
        double standard = scanner.nextDouble();

        System.out.print("Scholarship students : ");
        Set<String> nameSet = scoreHashMap.keySet();
        Iterator<String> it = nameSet.iterator();
        while(it.hasNext()) {
            String name = it.next();
            double score = scoreHashMap.get(name);
            if(score >= standard)
                System.out.print(name + " ");
        }
        System.out.println();
        scanner.close();

    }


}
