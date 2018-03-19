// 클래스 용도 - 소스 코드를 관리하기 쉽게 관련된 기능(메서스)을 묶을 때 사용
package step07;

public class Exam01_2 {
    public static void main(String[] args) {
        int result = 0;

        // 2 + 3 - 1 * 7 / 3 = ?
        result = Calculator.plus(2, 3);
        result = Calculator.minus(result, 1);
        result = Calculator.multiple(result, 7);
        result = Calculator.divide(result, 3);

        System.out.printf("result = %d\n", result);

    }
}