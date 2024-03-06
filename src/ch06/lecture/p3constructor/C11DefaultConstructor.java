package ch06.lecture.p3constructor;

public class C11DefaultConstructor {
    public static void main(String[] args) {

        C09MyClass1 obj1 = new C09MyClass1(33);
        C09MyClass2 obj2 = new C09MyClass2();
        C09MyClass3 obj3 = new C09MyClass3();

    }


}

class C09MyClass4 {
    int age;

    public C09MyClass4(int age) {
        this.age = age;
    }
}

class C09MyClass3 {
    //필드 x
    //생성자 x
    //메소드 x
    //생성자를 작성하지 않으면
    //파라미터 없는 생성자 자동 추가
    // no-args constructor (default constructor)


}

class C09MyClass2 {
    public C09MyClass2() {
    }
}

class C09MyClass1 {

    int age;

    public C09MyClass1(int age) {
        this.age = age;
    }
}