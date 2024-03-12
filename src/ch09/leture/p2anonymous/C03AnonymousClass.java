package ch09.leture.p2anonymous;

public class C03AnonymousClass {

    public static void main(String[] args) {
        C03Parent obj = new C03Parent() {
            @Override
            void method() {

            }
        };
        obj.method();

    }
}


abstract class C03Parent {
    abstract void method();

}