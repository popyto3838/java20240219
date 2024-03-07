package ch12.sec03.exam04;

public class RecordExample {
    public static void main(String[] args) {
        Member m = new Member("winter", "눈송이", 25);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());

    }
}
