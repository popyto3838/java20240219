package c02.lecture.p02type;

public class C20TypeConversion {
    // 정수형 : byte(1) , short (2) , int(4), long(8)
    // 실수형 : float(4) , double(8)
    // 작은크기의 타입의 값을 큰크기의 타입의 변수에 할당 가능
    // 반대는 안됨

    byte a = 23;
    int b = a;
    short c = a;
    long d = a;

    short e = 1241;
    int f = e;
    long g = e;

//    byte h=e;

    int i = 300;
    long j = i;
    //    short k=i;
    float l = 3.14F;
    double m = l;

    double n = 3.14;
//    float o =n;

    // 정수형을 실수형에 할당 가능
    long p = 1234;
    float q = p;
    double r = p;

    // char는 int 이상에 할당 가능

    char s = '힣';
    int t = s;
    //     short u =s;
    short v = 33;
    int w = 33;
}
