package ch06.lecture.p5static;

import java.util.Arrays;

public class C03Static {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3};
        int[] brr = new int[5];
        Arrays.fill(brr, 100);

        int[] crr = Arrays.copyOf(arr, arr.length);

    }
}
