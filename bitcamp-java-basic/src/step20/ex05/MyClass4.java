// 애노테이션 프로퍼티 값 지정하기 - 배열 값 지정
package step20.ex05;

@MyAnnotation3(
        // 배열 값을 지정할 때 중괄호를 사용한다.
        v1= {"홍길동", "임꺽정", "유관순"},
        v2= {1000, 2000, 3000},
        v3= {3.14f, 4.14f, 5.14f})
public class MyClass4 {
}
