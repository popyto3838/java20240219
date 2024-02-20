package c02.lecture.p02type;

import static java.lang.StringTemplate.STR;

public class C15StringTemplate {
    public static void main(String[] args) {
        //java 21
        //string template

        String name = "jane";
        String age = "30";

        String desc = "my name is" + name + "and age is" + age;
        System.out.println(desc);

        String desc2 = String.format("my name is%s and age is %s", name, age);
        System.out.println(desc2);

        String desc3 = STR."my name is \{name} and age is \{age}";

        System.out.println(desc3);

        //
        String address = "서울";
        String country = "한국";
        String desc4 = STR." I live in \{address} in \{country}";
        System.out.println(desc4);
    }
}
