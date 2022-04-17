/*
간단한 콘서트 예약 시스템을 만들어보자. 예약 시스템의 기능은 다음과 같다.
        ● 공연은하루에한번있다.
        ● 좌석은 S석, A석, B석으로 나뉘며 각각 10개의 좌석이 있다.
        ● 예약 시스템의 메뉴는 “예약", “조회", “취소”, “끝내기"가 있다.
        ● 예약은 한 자리만 가능하고, 좌석 타입, 예약자 이름, 좌석 번호를 순서대로 입력받아
        예약한다.
        ● 조회는 모든 좌석을 출력한다.
        ● 취소는 예약자의 이름을 입력받아 취소한다.
        ● 없는이름,없는번호,없는메뉴,잘못된취소등에대해서오류메시지를출력하고
        사용자가 다시 시도 하도록 한다.
*/

package Forth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P27 {

    public static void main(String[] args) {

        System.out.println("DK Concert hall reservation system");
        String[] sSheet = new String[10];
        String[] aSheet = new String[10];
        String[] bSheet = new String[10];
        initalizingSheet(sSheet);
        initalizingSheet(aSheet);
        initalizingSheet(bSheet);

        Sheet[] sheet = new Sheet[3];
        sheet[0] = new Sheet(sSheet);
        sheet[1] = new Sheet(aSheet);
        sheet[2] = new Sheet(bSheet);

        int count = 0;


        try {


            while (true) {
                if (count == 1) break;
                System.out.print("1 : Reservation\n" +
                        "2 : Status\n" +
                        "3 : Cancel\n" +
                        "4 : Quit\n" +
                        ">>> "
                );

                Scanner scanner = new Scanner(System.in);
                int option = scanner.nextInt();

                if (option < 1 || option > 4) {
                    System.out.println("잘 못된 번호 입력입니다.");
                    continue;
                }

                //  1 : Reservation
                switch (option) {
                    case 1: {
                        System.out.print("Class S(1), A(2), B(3) >> ");
                        int chooseNum = scanner.nextInt();

                        if (chooseNum < 1 || chooseNum > 3) {
                            System.out.println("잘 못된 번호 입력입니다.");
                            continue;
                        }

                        switch (chooseNum) {
                            case 1: {
                                System.out.println("Class S " + sheet[0].printSheetStr(sSheet));
                                sheet[0].registerFormat(scanner, chooseNum);
                            }
                            break;
                            case 2: {
                                System.out.println("Class A" + sheet[1].printSheetStr(aSheet));
                                sheet[1].registerFormat(scanner, chooseNum);
                            }
                            break;
                            case 3: {
                                System.out.println("Class B" + sheet[2].printSheetStr(bSheet));
                                sheet[2].registerFormat(scanner, chooseNum);
                            }
                            break;
                        }
                    }
                    break;


                    // 2 : Status
                    case 2: {
                        System.out.println("class S >> " + sheet[0].printSheetStr(sSheet));
                        System.out.println("class A >> " + sheet[1].printSheetStr(aSheet));
                        System.out.println("class B >> " + sheet[2].printSheetStr(bSheet));
                    }
                    break;

                    //cancel
                    case 3: {
                        System.out.printf("Class S(1), A(2), B(3) >> ");
                        int chooseNum = scanner.nextInt();

                        if (chooseNum < 1 || chooseNum > 3) {
                            System.out.println("잘 못된 번호 입력입니다.");
                            continue;
                        }

                        System.out.printf("Name >> ");
                        String name = scanner.next();
                        for (int idx = 0; idx < 10; idx++) {

                            switch (chooseNum) {
                                case 1: {
                                    if (name.equals(sSheet[idx])) {
                                        cancelShow(name, "S class ", idx);
                                        int expressidx = idx + 1;
                                        sSheet[idx] = " -" + expressidx + "- ";
                                    }
                                }
                                break;
                                case 2:
                                    if (name.equals(aSheet[idx])) {
                                        cancelShow(name, "A class ", idx);
                                        int expressidx = idx + 1;
                                        aSheet[idx] = " -" + expressidx + "- ";

                                    }
                                    break;

                                case 3:
                                    if (name.equals(bSheet[idx])) {
                                        cancelShow(name, "B class ", idx);
                                        int expressidx = idx + 1;
                                        bSheet[idx] = " -" + expressidx + "- ";
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                    case 4: {
                        System.out.println(">>> 4");
                        count++;
                        break;
                    }
                }
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }



    private static void cancelShow(String name, String sheetName, int index) {
        System.out.println(" Reservation for " + name + ", " + sheetName + " #" + index + " cancelled.");
    }


    private static void initalizingSheet(String[] sheet) {
        for (int index = 0; index < sheet.length; index++) {
            int expressIndex = index + 1;
            sheet[index] = "-" + expressIndex + "-";
        }
    }

}

class Sheet {

    String[] sheet;


    public Sheet(String[] sheet) {
        this.sheet = sheet;
    }

    public void registerFormat(Scanner scanner, int chooseNum) {
        System.out.printf("Name >> ");
        String name = scanner.next();
        System.out.printf("Sheet number >> ");
        int sheetNum = scanner.nextInt();
        sheet[sheetNum - 1] = name;
        String sheetName = "";
        switch (chooseNum) {
            case 1:
                sheetName = "S class";
                break;
            case 2:
                sheetName = "A class";
                break;
            case 3:
                sheetName = "B class";
                break;
        }
        System.out.println(sheetName + "sheet #" + sheetNum + " reserved for " + name);
    }


    public String printSheetStr(String[] sheet) {
        String sheetStructure = "";
        for (int index = 0; index < sheet.length; index++) {
            sheetStructure += sheet[index] + " ";
        }
        return sheetStructure;
    }

}
