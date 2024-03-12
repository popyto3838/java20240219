package ch09.sec07.exam02;

public class HomeExample {
    public static void main(String[] args) {
        Home home = new Home();

        home.use1();

        home.use2();

        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }
        });

    }
}
