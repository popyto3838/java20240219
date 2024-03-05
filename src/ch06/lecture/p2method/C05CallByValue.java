package ch06.lecture.p2method;

public class C05CallByValue {

    public static void main(String[] args) {
        C05MyClass obj1 = new C05MyClass();
        int[] a1 = new int[3];
        obj1.method1(a1);
    }
}

class C05MyClass {

    void method1(int[] arr) {

        System.out.println(arr.length);
        System.out.println("arr[0]=" + arr[0]);


    }

}