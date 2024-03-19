package ch15.leture.p2Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("react");
        list.add("spring");
        list.add("html");

        //고전적 for, 향상된 for, forEach

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // Iterator

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

    }
}
