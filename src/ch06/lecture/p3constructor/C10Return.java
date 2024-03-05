package ch06.lecture.p3constructor;

public class C10Return {
    public static void main(String[] args) {
        C10MyClass o = new C10MyClass();
        o.method1();
    }
}

class C10MyClass {
    // return;
    // 호출한 곳으로 값을 반환함
    // 반환되는 값의 타입이 메소드의 타입과 일치해야함
    int method1() {
        return 5;   //1. 메소드종료, 2. 값 반환
    }

    double method2() {
        return 3.14;
    }

    String method3() {
        return "hello";
    }

    double method4() {
        return 10;
    }

    // void : 반환하는 값이 없음
    //return 을 메소드 종료 기능으로만 사용 가능
    void method6() {
        //  return 30;

    }


}
