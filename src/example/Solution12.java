package example;

import java.util.HashSet;

// 1748
// nums= [1,2,3,2]
// output : 4
public class Solution12 {
    public int sumOfUnique(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        for (int num : nums) {
            if (set.add(num)) {
                sum += num;
                return sum;
            }
        }
        return 0;

    }
}
