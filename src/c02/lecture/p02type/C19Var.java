package c02.lecture.p02type;

import java.util.ArrayList;

public class C19Var {
    public static void main(String[] args) {
        //var: 변수의 타입을 할당되는 값으로부터 추론
        // 따라서 변수의 선언과 할당을 동시에 해야 함
        // 지역변수에서만 사용 가능 (필드, 파라미터, 리턴타입에서 사용 불가능)
        int a = 10;
        var b = 10; // b는 int로 추론됨

        String c = "hello";
        var d = "hi"; // d는 String으로 추론됨

        double e = 3.14;
        var f = 3.14; // f는 double로 추론됨


        // 정수형 literal 은 int
        var i = 100;

        // 실수형 literal 은 double
        var j = 3.14;

        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();


    }


}
