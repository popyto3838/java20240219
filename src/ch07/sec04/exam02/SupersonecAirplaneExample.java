package ch07.sec04.exam02;

public class SupersonecAirplaneExample {
    public static void main(String[] args) {

        SuperSonicAirplane sa = new SuperSonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flymode = SuperSonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flymode = SuperSonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
