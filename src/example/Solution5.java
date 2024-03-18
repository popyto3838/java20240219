package example;

import java.util.ArrayList;
import java.util.List;

public class Solution5 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> next = new ArrayList<>();
            next.add(1);
            for (int n = 1; n < prev.size(); n++) {
                int sum = prev.get(n) + prev.get(n - 1);
                next.add(sum);
            }
            next.add(1);

            prev = next;
        }
        return prev;
    }
}
