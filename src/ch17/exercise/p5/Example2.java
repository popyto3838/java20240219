package ch17.exercise.p5;

import java.util.List;
import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        double avg = list.stream()
                .mapToDouble(Member::getAge) // Member::getAge를 사용하여 스트림을 double 스트림으로 변환
                .average()
                .orElse(0.0);

    }
}
