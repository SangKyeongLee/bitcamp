// 메서드 분류 - 인스턴스 변수 사용
package step07;

public class Calculator3 {
    // 작업 결과를 개별적으로 관리하고 싶은 때 인스턴스 변수로 선언한다.
    // new 명령을 사용해서 만들어야 한다.
    // 변수 선언 앞에 static이 붙지 않는다.
    int result = 0;
    
    public static void plus(Calculator3 calc, int value) {
        // result는 더이상 클래스 변수가 아니기 때문에 직접 접근할 수 없다.
        // 오직 인스턴스 주소를 통해서만 접근 할 수 있다.
        calc.result += value;
    }
    public static void minus(Calculator3 calc, int value) {
        calc.result -= value;
    }
    public static void multiple(Calculator3 calc, int value) {
        calc.result *= value;
    }
    public static void divide(Calculator3 calc, int value) {
        calc.result /= value;
    }
}
