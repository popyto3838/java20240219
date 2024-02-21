package c02.sec02;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력 : ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y값 입력 : ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y:" + result);
        System.out.println();

        while (true) {
            System.out.print("입력문자열:");
            String data = scanner.nextLine();
            if (data.equals("q")) {
                break;
            }

            System.out.println("출력문자열:" + data);
            System.out.println();
        }


        System.out.println("종료");


    }
}
