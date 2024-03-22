package example;
//1748번을 Stream 으로 풀기


import java.util.stream.Collectors;
import java.util.Arrays;

public class Solution14 {


    public int sumOfUnique(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .mapToInt(e -> e.getKey())
                .sum();

    }


}
