// 메서드 분류 - 변수의 활용
package step07;

public class ExamY_2 {
    public static void main(String[] args) {
        // 계산 결과를 보관할 변수는 더이상 필요가 없다.
        //int result = 0;
        
        // 2 + 3 - 1 * 7 / 3 = ?
        Calculator2.plus(2);
        Calculator2.plus(3);
        Calculator2.minus(1);
        Calculator2.multiple(7);
        Calculator2.divide(3);

        System.out.printf("result = %d\n", Calculator2.result);

    }
}