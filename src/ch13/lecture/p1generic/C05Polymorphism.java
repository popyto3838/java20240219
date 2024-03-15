package ch13.lecture.p1generic;

public class C05Polymorphism {
    public static void main(String[] args) {
        C05Box<Number> box1 = new C05Box<>();
        C05Box<Integer> box2 = new C05Box<>();
        C05Box<Double> box3 = new C05Box<>();

        box1.someMethod();
        box2.someMethod();

    }
}


class C05Box<T extends Number> {
    private T item;


    public void someMethod() {
        item.intValue();
    }
}
