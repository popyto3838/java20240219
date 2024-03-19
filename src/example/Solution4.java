package example;

import java.util.ArrayList;
import java.util.List;

//118
public class Solution4 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        for (int i = 2; i <= numRows; i++) {
            List<Integer> prev = result.getLast();
            List<Integer> next = new ArrayList<>();
            next.add(1);

            for (int n = 1; n < prev.size(); n++) {
                next.add(prev.get(n) + prev.get(n - 1));
            }
            next.add(1);
            result.add(next);

        }

        return result;
    }

}
