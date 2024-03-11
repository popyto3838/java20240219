package ch08.lecture.p1interface;

public class C04Field {
    public static void main(String[] args) {

        int a = C04MyInterface.AGE;
        System.out.println(C04MyInterface.NAME);
    }
}


interface C04MyInterface {
    //public static final
    int AGE = 0;
    String NAME = "son hm";
    String MY_ADDRESS = "london";

    void method1();

}