package ch05.lecture.p1array;

import java.util.Arrays;

public class C16Null {

    public static void main(String[] args) {
        // 배열 원소의 기본값은 0, null

        int[] arr1 = new int[3];

        System.out.println(Arrays.toString(arr1));


        double[] arr2 = new double[3];
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = new String[4];
        System.out.println(Arrays.toString(arr3));
        
    }
}
