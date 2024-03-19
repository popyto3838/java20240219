package example;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();


        int maxKids = 0;
        for (int candy : candies) {
            maxKids = Math.max(maxKids, candy);
        }

        for (int candy : candies) {
            int tmp = candy + extraCandies;
            if (maxKids <= tmp) {
                list.add(true);
            }
            list.add(false);

        }

        return list;
    }


}
