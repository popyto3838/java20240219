package example;

public class Dog implements Soundable {
    @Override
    public String sound() {
        System.out.println("멍멍");
        return "멍멍";
    }
}
