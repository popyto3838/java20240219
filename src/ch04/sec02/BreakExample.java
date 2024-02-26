package ch04.sec02;

public class BreakExample {
    public static void main(String[] args) {
        

        while (true) {
            int num2 = (int) (Math.random() * 6) + 1;
            int num3 = (int) (Math.random() * 6) + 1;
            System.out.println(num2 + num3);
            if (num2 + num3 == 5) {

                break;
            }

        }


    }

}