// 애노테이션 프로퍼티 - value 프로퍼티
package step20.ex05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
    // 배열 프로퍼티의 기본 값을 지정할 때 중괄호를 사용한다.
    String[] v1() default {"가나다", "라마바"};
    int[] v2() default {100,200};
    float[] v3() default {3.14f,5.14f};
}













