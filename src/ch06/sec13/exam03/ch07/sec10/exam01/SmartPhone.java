package ch06.sec13.exam03.ch07.sec10.exam01;

public class SmartPhone extends Phone {
    public SmartPhone(String owner) {
        super(owner);
    }

    void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}