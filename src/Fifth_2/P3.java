package Fifth_2;

import java.util.HashMap;
import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> nationAndPopulation = new HashMap<>();
        System.out.println("Enter nation & population (Ex: Korea 5000)");

        String nation;
        String search;
        int population;

        while (true) {
            System.out.print("Nation & population >> ");
            nation = scanner.next();
            if(nation.equals("stop")) break;
            population = scanner.nextInt();
            nationAndPopulation.put(nation,population);
        }

        while (true) {

            System.out.print("Search population of ");
            search = scanner.next();
            if(search.equals("exit")) break;

            if(nationAndPopulation.containsKey(search)) {
                System.out.println("Population of " +nation+" is " + nationAndPopulation.get(search));
            } else {
                System.out.println("Cannot find "+ search);
            }
        }
    }
}


