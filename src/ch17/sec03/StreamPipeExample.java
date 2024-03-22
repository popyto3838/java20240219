package ch17.sec03;

import java.util.Arrays;
import java.util.List;

public class StreamPipeExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

//        Stream<Student> studentStream = list.stream();
//        //중간처리(학생객체를 점수로 매핑)
//        IntStream scoreStream = studentStream.mapToInt(student->student.getScore());
//
//        //최종처리 (평균점수)
//        double avg= scoreStream.average().getAsDouble();
//


        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println("평균점수:" + avg);


    }
}
