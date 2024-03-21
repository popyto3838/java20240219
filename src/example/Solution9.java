package example;
//414

//중복없이 정렬했을때, 3번째로 큰값 구하기, 3번째큰게없으면 가장큰값리턴
//Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
//input nums =[3,2,1]
//output : 1
//input nums =[1,2]
//output : 2

import java.util.TreeSet;

public class Solution9 {
    public int thirdMax(int[] nums) {

        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);      // 트리셋에넣으면 정렬 자동으로됨,크기순
        }
        if (set.size() >= 3) {
            set.pollLast();
            set.pollLast();
        }

        return set.pollLast();
    }

}
