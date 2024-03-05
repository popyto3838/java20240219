package ch06.lecture.p3constructor;

public class C02Constructor {

    public static void main(String[] args) {

        C02MyClass obj1 = new C02MyClass();
        C02MyClass obj2 = new C02MyClass();


    }
}


class C02MyClass {
    int age;

    C02MyClass() {
        age = 33;
    }

}
