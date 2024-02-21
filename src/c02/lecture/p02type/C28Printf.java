package c02.lecture.p02type;

public class C28Printf {
    public static void main(String[] args) {
        //System.out.printf()
        System.out.printf("hello world!"); // 파라미터 1개 (print와 유사)
        System.out.println();
        // 파라미터 2개
        // 첫번째 파라미터 문자열에 두번째 파라미터를 포함에서 출력
        System.out.printf("hello %s", "jane");

        //2개 이상이면 두번째,세번째,... 포함해서 출력
        System.out.println();

        System.out.printf("hello %s and %s", "son", "park");

        String a = "son";
        String b = "park";
        System.out.println(STR."hello \{a} and \{b}");

        System.out.printf("%s %s - %s", "lee", "kang", "in");


    }
}
