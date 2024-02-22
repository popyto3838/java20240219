package c03.lecture.p1arithmmetic;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class C02Arithmetic {

    public static void main(String[] args) {

        // 증감연산자
        // ++, --
        // 피연산자 갯수 : 1개
        // 연산의 결과타입 : 피연산자의 타입
        // 연산의 결과값
        // 1. 피연산자의 값  : 피연산자가 앞에 올때
        // 2. (피연산자의 값 +1) 또는 (피연산자의 값 -1) : 피연산자가 뒤에 올때
        //

        // *** 연산시 피연산자의 값이 1증가 또는 1 감소


        int a = 10;
        int a1 = a++;
        System.out.println("a1 = " + a1);
        System.out.println("a = " + a);

        int b = 10;
        int b1 = ++b;
        System.out.println("b1 = " + b1);
        System.out.println("b = " + b);


        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;


        while (true) {
            System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요");
            input = scanner.nextInt();
            if (input == -1) {
                System.out.println("중단합니다");
                break;
            }
            sum += input;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("입력한 숫자들의 합계 :" + sum);
        System.out.println("입력한 숫자들의 평균 : " + average);

    }


}


