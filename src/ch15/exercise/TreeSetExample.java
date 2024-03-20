package ch15.exercise;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student1> treeSet = new TreeSet<Student1>();

        treeSet.add(new Student1("blue", 96));
        treeSet.add(new Student1("hong", 86));
        treeSet.add(new Student1("white", 92));

        Student1 student = treeSet.last();

        System.out.println("최고점수" + student.score);
        System.out.println("최고점수를 받은 아이디" + student.id);

    }
}
