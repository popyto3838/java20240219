package example;

import java.util.HashSet;
import java.util.Set;

//1748  HashSet으로 풀기 //

public class Solution13 {
    public int sumOfUnique(int[] nums) {

        Set<Integer> set1 = new HashSet<>(); // 모두 담고
        Set<Integer> set2 = new HashSet<>(); // 중복인 것 담고

        for (int num : nums) {
            if (!set1.add(num)) {
                set2.add(num);
            }
        }

        int sum1 = 0;
        for (int num : set1) {
            sum1 += num;
        }

        int sum2 = 0;
        for (int num : set2) {
            sum2 += num;
        }

        return sum1 - sum2;

    }

}
