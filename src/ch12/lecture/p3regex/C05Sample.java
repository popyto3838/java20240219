package ch12.lecture.p3regex;

public class C05Sample {
    // _,$, 영문 대소문자, 숫자조합
    // 단 숫자로 시작하면 안됨

    public static void main(String[] args) {

        String pattern = "[_$a-zA-Z][_$a-zA-Z0-9]+";
        System.out.println("num".matches(pattern));  //true
        System.out.println("var7".matches(pattern));  //true
        System.out.println("class".matches(pattern));  //true
        System.out.println("PI".matches(pattern));     // true
        System.out.println("MAX_VALUE".matches(pattern)); //true
        System.out.println("7num".matches(pattern)); //false
    }
}
