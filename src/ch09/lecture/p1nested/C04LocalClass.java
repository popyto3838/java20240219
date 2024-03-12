package ch09.lecture.p1nested;

public class C04LocalClass {
    void method1() {

        int j = 3;
        int k = 2; // effectively final

        class LocalClass {
            void method1() {
                //
                int i = 0;
                //
                System.out.println(i);
                i = 1; // 변경도됨

                // 감싸고 있는 메소드의 final지역변수만 사용 가능
                System.out.println(j);
                // j = 5;//감싸고 있는 메소드의 변수의값 변경은 안됨
                System.out.println(k);
            }

        }
    }
}
