package ch6.lecture.p2method;

public class C07OverLoad {
    public static void main(String[] args) {
        C07MyClass o1 = new C07MyClass();
        //메소드 호출 시 argument의 타입을 보고 실행 시킬 메소드 결정됨

    }
}

class C07MyClass {
    //파라미터의 갯수, 타입이 다른
    //같은 이름의 메소드 작성 가능

    void method1() {
    }

    void method1(int a) {
    }

    void method1(double a) {
    }

    void method1(double a, double b) {
    }
}