package ch6.lecture.p2method;

public class C01Method {
    public static void main(String[] args) {

        C01Person person1 = new C01Person();
        C01Person person2 = new C01Person();

        person1.name = "son";
        person2.name = "lee";

        person1.walk();
        person2.walk();

    }

}

class C01Person {
    // 필드
    // 이름, 나이, 주소

    String name;

    //기능(메소드)

    void walk() {
        //메소드가 실행하는 코드들
        //
        System.out.println(name + "걷습니다.");

    }
}