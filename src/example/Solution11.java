package example;

import java.util.LinkedList;
import java.util.Queue;

//1700
//샌드위치  1100
//         0101

public class Solution11 {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        for (int student : students) {
            queue1.offer(student);
        }

        for (int sandwich : sandwiches) {
            queue2.offer(sandwich);
        }

        int remain = queue1.size();
        while (!queue1.isEmpty() && remain > 0) {
            int student = queue1.peek();
            int sandwich = queue2.peek();

            if (student == sandwich) {
                queue1.poll();
                queue2.poll();

                remain = queue1.size();
            } else {
                remain--;
                int s = queue1.poll();
                queue1.offer(s);
            }
        }

        return queue1.size();
    }


}


//   Queue<Integer> sut = new LinkedList<>();
//
//        for (int i = 0; i < students.length; i++) {
//            sut.offer(students[i]);
//        }
//
//        Queue<Integer> sand = new LinkedList<>();
//        for (int i = 0; i < sandwiches.length; i++) {
//            sand.offer(sandwiches[i]);
//        }
//
//        for (int student : students) {
//            if (sut.peek() == sand.peek()) {
//                sut.poll();
//                sand.poll();
//            } else {
//                sut.poll();
//                sut.offer(sut.poll());
//            }
//        }
//
//        return sut.size();
//

// ArrayList, HashSet, HashMap, Stack, Queue, LinkedList ;;
//        1748, 1512 , 2006, 2206, 2363