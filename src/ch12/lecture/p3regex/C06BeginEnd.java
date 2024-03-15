package ch12.lecture.p3regex;

public class C06BeginEnd {
    public static void main(String[] args) {
        //^(caret) :시작
        //$ : 끝

        String s1 = ",,abc,def,,,xyz,,,";
        String s = s1.replaceAll(",+", "");
        System.out.println("s=" + s);

        String s2 = s1.replaceAll("^", "hi");
        System.out.println("s2=" + s2);


    }

    class Solution {
        public String[] solution(String myString) {
            String y = myString;
            String[] answer = {};
            String x = y.replaceAll("x", "");
            String[] s = x.split("x");
            return s;

        }
    }
}
