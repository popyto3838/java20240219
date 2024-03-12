package ch09.lecture.p1nested;

public class C02InstanceNestedClass {
    public static void main(String[] args) {


        C02MyCLass obj1 = new C02MyCLass();
        C02MyCLass.C02NestedClass obj = obj1.new C02NestedClass();
    }

}

class C02MyCLass {
    // 중첩클래스(nested class)
    class C02NestedClass {

    }

    //필드
    //생성자
    //메소드
    void method1() {
        C02NestedClass obj1 = new C02NestedClass();
    }
}
