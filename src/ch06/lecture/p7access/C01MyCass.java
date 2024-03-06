package ch06.lecture.p7access;

public class C01MyCass {
    //access modefier( 접근 제한자, 접근 제어자)
    //필드,메소드
    //생성자,클래스

    //public    :모든곳에서 접근 가능
    // protected : package private + 다른 패키지여도 상속받으면 접근 가능
    // default  : 같은 패키지 내에서 접근 가능
    //private  : 같은 클래스 내에서만 접근 가능


    //public field
    public int age;

    //package private

    String name;

    void method1() {
        System.out.println(age);

    }

}
