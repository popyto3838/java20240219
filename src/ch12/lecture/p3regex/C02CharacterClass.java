package ch12.lecture.p3regex;

public class C02CharacterClass {
    public static void main(String[] args) {
        // 문자집합
        System.out.println("a".matches("[abc]")); //true
        System.out.println("b".matches("[abc]")); //true
        System.out.println("d".matches("[abc]")); //true
        System.out.println("A".matches("[abc]")); //false


    }
}
