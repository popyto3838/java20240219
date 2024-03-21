package ch15.leture.p6of;

import java.util.Set;

public class C02Set {
    public static void main(String[] args) {

        Set<String> set1 = Set.of("spring", "java", "css", "react");
        System.out.println(set1);
        Set<String> set2 = Set.of("spring", "java", "css", "spring");// 중복x
    }
}
