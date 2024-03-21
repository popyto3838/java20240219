package ch15.leture.p6of;

import java.util.ArrayList;
import java.util.List;

public class C01List {
    public static void main(String[] args) {

        //

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("html");
        list.add("react");
        System.out.println(list);
        list.add("spring");
        list.remove(0);


        //of
        List<String> list2 = List.of("java", "css", "html", "react");
        System.out.println(list2);
        //list2.add("jsp"); // 수정이 안됨

    }

}
