package example;

import java.util.ArrayList;
import java.util.List;

//같은숫자는싫어
//
//입출력 예
//arr	answer
//[1,1,3,3,0,1,1]	[1,3,0,1]
//        [4,4,4,3,3]	[4,3]


public class Solution6 {

    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int last = -1;
        for (int num : arr) {
            if (last != num) {
                list.add(num);
                last = num;
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
