package Fifth_2;

import java.util.*;

public class P6 {
    private final Scanner scanner = new Scanner(System.in);
    private final HashMap<String, Student> h = new HashMap<String, Student>();

    private void read() {
        System.out.println("Enter student name, major, id and average of grade.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String text = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            String department = st.nextToken().trim();
            String id = st.nextToken().trim();
            double grade = Double.parseDouble(st.nextToken().trim());

            Student student = new Student(name, department, id, grade);
            h.put(name, student);
        }
    }

    private void printAll() {
        Set<String> key = h.keySet();
        Iterator<String> it = key.iterator();
        while (it.hasNext()) {
            String name = it.next(); // 이름 알아냄
            Student student = h.get(name); // 이름을 키로하여 해시맵으로 Student 객체 얻어냄
            System.out.println("---------------------------");
            System.out.println("Name : " + student.getName());
            System.out.println("Major : " + student.getMajor());
            System.out.println("ID : " + student.getId());
            System.out.println("Avg. Grade : " + student.getAverage());
            System.out.println("---------------------------");
        }
    }

    private void processQuery() {
        while (true) {
            System.out.print("Student name >> ");
            String name = scanner.nextLine();
            if (name.equals("exit")) break;

            Student student = h.get(name);
            if (student == null){

            } else { // 해시맵에서 검색된  Student 객체
                System.out.printf("%s, %s, %s, %.1f\n", student.getName(), student.getMajor(), student.getId(), student.getAverage());
            }
        }
    }

    public void run() {
        read();
        printAll();
        processQuery();
        scanner.close();
    }

    public static void main(String[] args) {
        P6 p6 = new P6();
        p6.run();
    }
}
