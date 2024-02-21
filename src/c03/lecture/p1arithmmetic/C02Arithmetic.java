package c03.lecture.p1arithmmetic;

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

    }

}
