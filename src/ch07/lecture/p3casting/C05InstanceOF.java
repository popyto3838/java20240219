package ch07.lecture.p3casting;

public class C05InstanceOF {

    public static void main(String[] args) {
        A a = new E();


        System.out.println(a instanceof A); //T
        System.out.println(a instanceof B); //T
        System.out.println(a instanceof C); //F
        System.out.println(a instanceof D); //F
        System.out.println(a instanceof E); //t
        System.out.println(a instanceof F); //F
    }


}

class A {
}

class B extends A {
}

class D extends B {
}

class E extends B {
}


class C extends A {
}

class F extends C {
}

