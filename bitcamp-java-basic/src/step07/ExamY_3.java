// 메서드 분류 - 클래스 변수의 단점
package step07;

public class ExamY_3 {
    public static void main(String[] args) {
        
        
        // 식1) 2 + 3 - 1 * 7 / 3 = ?
        // 식2) 3 * 2 + 7 / 4 - 5 = ?
        
        // 식1 과 식2를 개별적으로 동시에 계산할 수 없다.
        Calculator2.plus(2);
        Calculator2.plus(3);
        
        Calculator2.plus(3);
        Calculator2.multiple(2);
        
        Calculator2.minus(1);
        Calculator2.plus(7);
        
        Calculator2.multiple(7);
        Calculator2.divide(4);
        
        Calculator2.divide(3);
        Calculator2.minus(5);

        System.out.printf("result = %d\n", Calculator2.result);

    }
}