package ch04.lecture.p1if;

public class C02Else {
    public static void main(String[] args) {

        //ele : if의 ()조건이 false일 때 실행되는 코드 블럭을 정의

        boolean condition = true;

        if (condition) {
            System.out.println("statemen 1");
            System.out.println("statemen 2");
        } else {
            // if의 조건이 false 일 때 실행
            System.out.println("statemen 3");
            System.out.println("statemen 4");
        }
        System.out.println("statemen 5");
        System.out.println("statemen 6");
    }
}
