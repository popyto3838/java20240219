package ch06.lecture.p7access;

public class C04GetterSetter {
}

class C04MyClass {


    private String name;
    private int age;
    private boolean married;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}

