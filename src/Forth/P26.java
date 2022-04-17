/*
이름(name), 전화번호(tel) 필드와 생성자 등을 가진 Phone 클래스를 작성하고,
실행 예시와 같이 동작하는 PhoneBook 클래스를 작성하라.
PhoneBook 클래스에서 저장할 사람의 수를 입력받고, Phone 객체 배열을 생성한다.
한 사람의 정보는 하나의 Phone 객체에 저장한다.
*/
package Forth;

import java.util.Scanner;

public class P26 {

}

class PhoneBook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Number of persons : ");
        int num = scanner.nextInt();

        Phone phone[] = new Phone[num];


        for (int index = 0; index < num; index++) {
            System.out.printf("Input name & phone number >> ");

            String name = scanner.next();
            String phoneNum = scanner.next();
            phone[index] = new Phone(name,phoneNum);

        }

        System.out.println("Saved...");

        while (true) {
            System.out.printf("Search >> ");
            String searchName = scanner.next();
            if (searchName.equals("quit")) break;
            int count = 0;

            for (int index = 0; index < num; index++) {
                if (phone[index].returnName().equals(searchName)){
                    phone[index].show();
                    count++;
                }
            }
            if(count == 0) {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}

class Phone {

    String name;
    String phone;

    public Phone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String returnName() {
        return name;
    }

    public void show() {
        System.out.println(name + "/" + phone);
    }

}
