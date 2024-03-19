package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        for (Integer s : scores) {
            System.out.println(s + " ");

        }
        System.out.println("\n");


        System.out.println("가장낮은점수 : " + scores.first());
        System.out.println("가장높은점수 : " + scores.last());
        System.out.println("95점아래점수 : " + scores.lower(95));
        System.out.println("95점위의점수 : " + scores.higher(95));
        System.out.println("95점이거나 바로아래점수 : " + scores.floor(95));
        System.out.println("85점이거나 바로위의점수: " + scores.ceiling(85));

        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for (Integer s : descendingScores) {
            System.out.println(s + " ");

        }
        System.out.println("\n");

        NavigableSet<Integer> rageSet = scores.tailSet(80, true);
        for (Integer s : rageSet) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

        rageSet = scores.subSet(80, true, 90, false);
        for (Integer s : rageSet) {
            System.out.println(s + " ");
        }


    }

}
