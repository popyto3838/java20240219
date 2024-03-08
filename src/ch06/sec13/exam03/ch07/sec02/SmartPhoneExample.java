package ch06.sec13.exam03.ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("myPhone = " + myPhone.model);
        System.out.println("myPhone = " + myPhone.color);

        System.out.println("myPhone = " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        myPhone.sendVoice("아~ 네 반갑습니다.");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}