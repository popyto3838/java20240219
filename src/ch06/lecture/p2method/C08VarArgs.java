package ch06.lecture.p2method;

public class C08VarArgs {
    public static void main(String[] args) {

        C08MyClass O1 = new C08MyClass();


    }


}


class C08MyClass {

    void method1() {
        System.out.println("C08MyClass.method1,파라미터 없음");
    }

    void method1(int a) {
        System.out.println("C08MyClass.method1, 파라미터 한개");
    }

    void method1(int a, int b) {
        System.out.println("C08MyClass.method1, 파라미터두개");

    }

    //varargs (가변인자, 가변길이 매개변수)
    void method2(int... a) {

    }


}
