// 메서드 분류 - 인스턴스 변수
package step07;

public class ExamY_4 {
    public static void main(String[] args) {
        // 식1) 2 + 3 - 1 * 7 / 3 = ?
        // 식2) 3 * 2 + 7 / 4 - 5 = ?
        
        // 두 개의 식의 계산 결과를 따로 관리하기 위해서는
        // result 변수를 개별적으로 생성해야 한다.
        Calculator3 c1 = new Calculator3();
        Calculator3 c2 = new Calculator3();
        
        Calculator3.plus(c1, 2);
        Calculator3.plus(c2, 3);
        
        Calculator3.plus(c1, 3);
        Calculator3.multiple(c2, 2);
        
        Calculator3.minus(c1, 1);
        Calculator3.plus(c2, 7);
        
        Calculator3.multiple(c1, 7);
        Calculator3.divide(c2, 4);
        
        Calculator3.divide(c1, 3);
        Calculator3.minus(c2, 5);

        System.out.printf("c1.result = %d\n", c1.result);
        System.out.printf("c2.result = %d\n", c2.result);

    }
}