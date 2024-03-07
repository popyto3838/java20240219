package ch07.p2polymorphism;

public class C03Polymorphism {
}

class C03Animal {
    public void breathe() {
        System.out.println("호흡하다");
    }

}


class C03Fish extends C03Animal {
    @Override
    public void breathe() {
        System.out.println("아가미 호흡");
    }

    public void swim() {
        System.out.println("헤엄치다");
    }

}

class C03Cat extends C03Animal {


}
