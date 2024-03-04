package ch6.lecture.p2method;

public class C04Parameter {
    public static void main(String[] args) {
        C04Calculator cal = new C04Calculator();
        cal.printSum(5, 7);
        cal.printSum(9, 13);
        // 메소드 호출시 파라미터에 값(매개값, 인수, argument)을 줘야함
        cal.printDivide(3.14, 0.5);
        cal.printDivide(9.0, 3);
        cal.printDivide(10, 2);


    }
}


class C04Calculator {
    //필드들...
    //메소드들...
    void printSum(int a, int b) {
        int result = a + b;
        System.out.println("result=" + result);
    }

    void printDivide(double a, double b) {
        double result = a / b;
        System.out.println("result=" + result);

    }
}
