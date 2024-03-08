package ch07.sec10.exam01;

public class SmartPhone extends Phone {

    SmartPhone(String owner) {
        super(owner);
    }

    //메소드선언
    void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
