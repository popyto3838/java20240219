package ch13.lecture.p1generic;

public class C09GenericMethod {
    public static void main(String[] args) {
        C07Box<String> box = new C07Box<>();
        // java는 메소드 파라미터로 type 파라미터 유추

        method("helo"); // String으로 유추
        method(34); //Integer로 유추

        String s = method1();
        Integer i = method1();
    }
    //제너릭메소드

    public static <T> void method(T parm) {
    }

    public static <T> T method1() {
        return null;
    }
}

