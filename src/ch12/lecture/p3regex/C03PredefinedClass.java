package ch12.lecture.p3regex;

public class C03PredefinedClass {
    public static void main(String[] args) {

        //[0-9] :\d

        String p1 = "\\d";
        System.out.println("0".matches(p1)); //true
        System.out.println("5".matches(p1)); //true
        System.out.println("a".matches(p1)); //false
        System.out.println("012".matches(p1));//false


        //whitespace : \s

        System.out.println(" ".matches("\\s")); //true
        System.out.println("\t".matches("\\s")); //true
        System.out.println("\n".matches("\\s")); //true

        //연습
        String str = "손 흥민";
        String s = str.replaceAll("\\s", "");
        System.out.println(s);

        //word character
        System.out.println("s".matches("\\w"));
        System.out.println("9".matches("\\w"));
        System.out.println("W".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println(" ".matches("\\w"));  //false
        System.out.println("$".matches("\\w"));  //false


    }
}
