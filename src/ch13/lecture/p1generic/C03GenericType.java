package ch13.lecture.p1generic;

public class C03GenericType {
    public static void main(String[] args) {

        C03Box<String, Integer> box1 = new C03Box<>();
        var box2 = new C03Box<Double, String>();


    }
}

class C03Box<T, U> {
    private T item1;
    private U item2;


    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public U getItem2() {
        return item2;
    }

    public void setItem2(U item2) {
        this.item2 = item2;
    }


}
