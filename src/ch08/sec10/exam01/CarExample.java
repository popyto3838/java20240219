package ch08.sec10.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.run();
        mycar.tire1 = new KumhoTire();
        mycar.tire2 = new KumhoTire();

        mycar.run();

    }
}
