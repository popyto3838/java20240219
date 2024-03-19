package example;

import java.util.HashSet;
import java.util.Set;
//287

public class Solution7 {
    public int findDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }

        }

        return 0;
    }
}
