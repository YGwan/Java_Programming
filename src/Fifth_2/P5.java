package Fifth_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student {
    String name;
    String major;
    String id;
    double average;

    public Student(String name, String major, String id, double average) {
        this.name = name;
        this.major = major;
        this.id = id;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getId() {
        return id;
    }

    public double getAverage() {
        return average;
    }

    public void printAll() {
        System.out.println("Name : "+ name);
        System.out.println("Major : "+ major);
        System.out.println("ID : "+ id);
        System.out.println("Avg. Grade : "+ average);
        System.out.println("--------------------");
    }

    public void showLine() {
        System.out.printf("%s, %s, %s, %.1f\n",name, major, id, average);
    }
}


public class P5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student[] student = new Student[4];

        //run 함수
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter student name, major, id and average of grade.");


        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String text = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            String major = st.nextToken().trim();
            String id = st.nextToken().trim();
            double average = Double.parseDouble(st.nextToken().trim());

            student[i] = new Student(name, major, id, average);
            students.add(student[i]);
        }

        System.out.println("--------------------");

        for (int index = 0; index < students.size(); index++) {
            Student s = students.get(index);
            s.printAll();
        }


        while (true) {

            System.out.print("Student name >> ");
            String search = scanner.next();
            if(search.equals("exit")) break;

            for(int index = 0; index < students.size(); index++) {
                if(search.equals(students.get(index).name))
                   student[index].showLine();

            }
        }

        scanner.close();
    }

}

