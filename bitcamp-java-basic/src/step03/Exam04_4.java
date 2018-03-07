// 클래스 사용 - import
package step03;

// import 는 package 선언 다음에 위치해야 한다.
import step03.test.B;

public class Exam04_4 {
    public static void main(String[] args) {
        
        // 다른 패키지의 클래스 사용
        // => 패키지 이름을 항상 붙여야 한다.
        //    그래야만 컴파일러가 해당 클래스를 찾을 수 있다.
        step03.test.B v1;
        v1 = new step03.test.B();

        // 매번 위와 같이 패키지명을 적는다면 코드가 너무 길어진다.
        // 해결책!
        // => 소스 파일 상단에 패키지 정보를 미리 적어둔다.
        // => import 패키지.클래스명;
        B v2;
        v2 = new B();
    }
}