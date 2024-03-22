package ch17.lecture.p3optional;

import java.util.OptionalInt;

public class C02Primitive {

    public static void main(String[] args) {
        //OptionalInt: 기본타입 int 값을 가지고 있을 수 있는 컨테이너
        //OptionalDouble : double 값을 가지고 있을 수 있는 컨테이너
        //OptionalLong : long 값을 가지고 있을 수 있는 컨테이너

        OptionalInt o1 = OptionalInt.of(3);
        OptionalInt o2 = OptionalInt.of(50);
        OptionalInt o3 = OptionalInt.empty();

        //isPresent : 값이 있으면 true
        //isEmpty : 값이 없으면 true
        o1.isPresent();//true


        //getAsInt : 값 얻기(없으면 Exception)

        //orElse : 값 없으면 기본값으로 얻기


    }
}
