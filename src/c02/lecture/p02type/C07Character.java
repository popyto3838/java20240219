package c02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {

        //char (character)
        //2byte == 16bits
        // 0 ~ 65535

        char a = 99;
        char b = 120;
        char c = 65535;
//        char d = 655356; 
//        char e = -1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        char f = 8258;
        System.out.println("f = " + f);

        int o = 0x1f3a4;
        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println("emojis=" + emojis);

        char q = '힣';
//        char r = '😂';  16비트 넘어가서 안됨

        System.out.println("q =" + q);
//        System.out.println("r =" + r);


    }
}
