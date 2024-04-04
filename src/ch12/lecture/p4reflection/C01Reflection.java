package ch12.lecture.p4reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class C01Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class<MyClass1> class1 = MyClass1.class;
        Class<?> class2
                = Class.forName("ch12.lecture.p4reflection.MyClass1");

        System.out.println(class1 == class2); //true , 같은객체

        MyClass1 obj = new MyClass1();
        Class<? extends MyClass1> class3 = obj.getClass();

        System.out.println(class2 == class2); //true , 같은객체

        Field[] fields = class1.getDeclaredFields();
        Constructor<?> constructor = class1.getDeclaredConstructor();


        System.out.println("필드이름 출력");
        for (Field field : fields) {
            System.out.println(field.getName());

        }
        System.out.println("생성자 이름 출력");

    }
}


class MyClass1 {
    private String name;
    private Integer age;

    public MyClass1() {

    }

    public MyClass1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void myMethod1(String param1, Double param2) {

    }

}