package ch06.lecture.p3constructor;

import java.util.Random;

public class C09Return {
    public static void main(String[] args) {
        C09MyClass obj = new C09MyClass();
        obj.method2();
    }


}

class C09MyClass {
    void method1() {
        // return :
        // 1. 메소드 종료
        // 2. 메소드가 호출된 곳으로 값 반환
        //    이때 반환되는 값의 타입 메소드의 타입과 일치해야함!

        System.out.println("statement 1");
        System.out.println("statement 2");
        return; // 메소드 종료
    }

    void method2() {
        Random random = new Random();
        while (true) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            System.out.println(dice1 + "," + dice2 + ")");
            if (dice1 == dice2) {
                return;
            }
        }
    }
}