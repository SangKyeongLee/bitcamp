// 예외 처리 문법을 적용하기 전
package step21.ex01;

public class Exam01_1 {
    public static void main(String[] args) {
        // 유효한 값을 지정하여 메서드를 호출할 때,
        int result = Calculator.compute("+", 100, 200);
        System.out.println(result);
    }
}
