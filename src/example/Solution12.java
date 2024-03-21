package example;

import java.util.HashMap;
import java.util.Map;

// 1748
// nums= [1,2,3,2]
// output : 4
public class Solution12 {

    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            Integer value = map.get(num);
            if (value == null) {
                map.put(num, 1);
            } else {
                map.put(num, value + 1);
            }
        }

        int result = 0;
        var entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                result += entry.getKey();
            }
        }

        return result;


    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        Solution12 solu = new Solution12();
        solu.sumOfUnique(nums);
        
    }
}


//HashSet<Integer> set = new HashSet<>();
//
//int sum = 0;
//        for (int num : nums) {
//        if (set.add(num)) {
//sum += num;
//                return sum;
//            }
//                    }
//                    return 0;