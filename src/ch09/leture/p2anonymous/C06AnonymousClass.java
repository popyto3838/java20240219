package ch09.leture.p2anonymous;

public class C06AnonymousClass {
    public static void main(String[] args) {

        C06MyInterFace obj = new C06MyInterFace() {
            @Override
            public void method1() {

            }

            @Override
            public void method2() {

            }
        };

        obj.method1();
        obj.method2();
    }
}

interface C06MyInterFace {
    void method1();

    void method2();
}
