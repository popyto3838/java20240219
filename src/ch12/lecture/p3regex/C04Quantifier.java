package ch12.lecture.p3regex;

public class C04Quantifier {
    public static void main(String[] args) {


        // 수량자
        //{n}:정확히 n번
        //{n.m}: n~m번
        //[n,] : n번 이상
        // + : {1,} :1번이상
        //* : {0,} :0번이상
        //? : {0,1} : 한번 또는 없음


        //{n} :n번
        String p1 = "\\d{3}";
        System.out.println("012".matches(p1)); //true
        System.out.println("892".matches(p1)); //true
        System.out.println("89z".matches(p1)); //false
        System.out.println("6".matches(p1)); //false

        String p2 = "010-\\d{4}-\\d{4}";
        System.out.println("010-1234-9876".matches(p2));

        String p5 = "[a-zA-Z가-힣]{1,}";
        String p6 = "010-?\\d{4}-?\\d{4}";

    }

}
