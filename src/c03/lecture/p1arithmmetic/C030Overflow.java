package c03.lecture.p1arithmmetic;

import java.util.Scanner;

public class C030Overflow {
    public static void main(String[] args) {

        //byte 1,short2 ,int 4,long8
        // float 4, double 8
        int a = 2_000_000_000;
        int b = 1_000_000_000;

        int c = a + b;

        // overflow : 산술 연산시 저장공간의 한계를 넘어서 원하지 않는 값을 얻음

        System.out.println("c=" + c);


        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("상품의 가격을 입력하세요");
            int price = scanner.nextInt();
        }


    }
}
