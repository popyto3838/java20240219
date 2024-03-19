package ch15.leture.p2Set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //추가 add
        set.add("java");
        set.add("spring");
        set.add("html");
        set.add("react");

        //크기 size
        System.out.println(set.size()); //4

        //원소가 없을 때만 추가
        set.add("css"); // ok
        set.add("java"); //x

        System.out.println(set.size()); // 5

        //검색 contains
        boolean b3 = set.contains("angular"); //false

        //지우기 remove
        set.remove("java");
        set.remove("css");


    }

}
