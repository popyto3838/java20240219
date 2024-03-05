package ch06.lecture.p3constructor;

public class C04Constructor {
    C04MyClass o1 = new C04MyClass("son", 33);
    C04MyClass o2 = new C04MyClass("lee", 29);
}

class C04MyClass {
    String name;
    int age;

    C04MyClass(String initialName, int initialAge) {
        name = initialName;
        age = initialAge;

    }


}
