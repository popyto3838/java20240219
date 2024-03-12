package ch09.leture.p2anonymous;

public class C04AnonymousClass {
    public static void main(String[] args) {
        C04Parent obj = new C04Parent() {
            @Override
            void method() {
                System.out.println("C04Child.method");
            }
        };

    }
}

class C04Parent {
    void method() {
        System.out.println("C04Parent.method");
    }


}