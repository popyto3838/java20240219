package ch12.lecture.p5annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotation3
public class C03Annotation {
    @MyAnnotation3
    private String name;

    @MyAnnotation3
    C03Annotation(
            @MyAnnotation3
            String name) {
    }

    @MyAnnotation3
    public void metod(@MyAnnotation3
                      String name) {
        @MyAnnotation3
        int variable;
    }

}


@Target({ElementType.METHOD,
        ElementType.PARAMETER,
        ElementType.TYPE,
        ElementType.LOCAL_VARIABLE,
        ElementType.CONSTRUCTOR,
        ElementType.FIELD})
@interface MyAnnotation3 {
}