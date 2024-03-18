package example;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int maxKid = 0;
        for (int i : candies)
            maxKid = Math.max(maxKid, i);

        for (int candy : candies) {
            int tmp = candy + extraCandies;

            if (tmp >= maxKid) list.add(true);
            else list.add(false);
        }

        return list;
    }
}
