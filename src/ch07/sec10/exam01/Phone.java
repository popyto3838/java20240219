package ch07.sec10.exam01;

public class Phone {

    //필드선언
    String owner;

    //생성자선언

    Phone(String owner) {
        this.owner = owner;
    }

    //메소드선언
    void turnOn() {
        System.out.println("폰전원을 켭니다.");
    }

    void turnOff() {
        System.out.println("폰전원을 끕니다.");
    }


}
