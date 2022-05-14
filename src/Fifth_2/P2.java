package Fifth_2;

import Fifth.P3;

import java.util.ArrayList;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> grades = new ArrayList<>();
        System.out.print("Enter grades of 6 students (A/B/C/D/F)>> ");
        for(int num=0; num<6; num++) {
            char grade = scanner.next().charAt(0);
            grades.add(grade);
        }


        boolean check = true;
        double sum = 0;

        for (Character grade : grades) {
            if (grade == 'A') sum += 4.0;
            else if (grade == 'B') sum += 3.0;
            else if (grade == 'C') sum += 2.0;
            else if (grade == 'D') sum += 1.0;
            else if (grade == 'F') sum += 0;
            else {
                check = false;
            }
        }

        if(check){
            System.out.println("Average : " + sum/6);
        } else {
            System.out.println("Invalid");
        }

    }
}
