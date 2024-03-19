package example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution8 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                list.add(num);
            } else {
                set.add(num);
            }

        }
        return list;

    }

    public List<Integer> findDuplicates1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (!set.add(num)) {
                list.add(num);
            }
        }

        return list;
    }


}

//2215
//2032
//771
//1684