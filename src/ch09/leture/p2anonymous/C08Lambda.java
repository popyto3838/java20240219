package ch09.leture.p2anonymous;

public class C08Lambda {
    public static void main(String[] args) {

        C08MyInterface obj = new C08MyInterface() {
            @Override
            public void method() {

            }
        };

        obj.method();
    }
}

interface C08MyInterface {
    void method();


}
