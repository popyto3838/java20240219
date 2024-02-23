package ch03.lecture.p1arithmmetic;

public class C06Divide {
    public static void main(String[] args) {
        // 실수 double를 0으로 나누면 결과 Infinity

        double a = 3.0;
        double b = 0.0;

        double c = a / b;
        System.out.println("c = " + c);

        double d = (-a) / b;
        System.out.println("d = " + d);

        //실수에서 나머지 % 연산시 NaN
        double i = 3.0;
        double j = 0.0;
        double k = i % j;
        System.out.println("k = " + k);

        //Infinity 인지

        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils / students;
        System.out.println("pencilsPerStudent = " + pencilsPerStudent);

        int pencilsleft = pencils % students;
        System.out.println("pencilsleft = " + pencilsleft);

    }
}
