package ch04.sec02;

import java.util.Scanner;

public class javava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int remain = 0;
        int withdraw = 0;


        while (run) {

            System.out.println("=========================");
            System.out.println("1.예금 | 2.출금 |3.잔고|종료");
            System.out.println("=========================");

            String strNum;
            strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                remain = 10000;
                System.out.println(remain);

            } else if (strNum.equals("2")) {
                withdraw = 2000;
                System.out.println(withdraw);

            } else if (strNum.equals("3")) {
                remain = remain - withdraw;
            } else {
                System.out.println("종료");

            }


        }

    }
}
