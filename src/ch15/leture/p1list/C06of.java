package ch15.leture.p1list;

import java.util.List;

public class C06of {
    public static void main(String[] args) {
        //List.of 로 수정 불가능한 리스트 객체 생성

        List<String> list1 = List.of();
        System.out.println(list1.size());

        List<String> list2 = List.of("java");
        System.out.println(list2.size());
        System.out.println(list2);

        List<String> list3 = List.of("java", "vue", "jsp");
        //  list3.add("hello"); // Exception
        //  list3.remove("hello"); // Exception
        //  list3.("hello"); // Exception
        System.out.println(list3);
    }
}
