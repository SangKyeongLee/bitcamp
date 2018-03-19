// 메서드 분류 - 인스턴스 변수와 인스턴스 메서드
package step07;

public class ExamY_5 {
    public static void main(String[] args) {
        // 식1) 2 + 3 - 1 * 7 / 3 = ?
        // 식2) 3 * 2 + 7 / 4 - 5 = ?
        Calculator4 c1 = new Calculator4();
        Calculator4 c2 = new Calculator4();
        
        // 계산을 수행할 때 계산 결과를 보관할 메모리를 전달하라!
        // => 인스턴스 메서드를 사용하면 파라미터로 메모리 주소를 전달할 필요가 없다.
        c1.plus(2);
        c2.plus(3);
        
        c1.plus(3);
        c2.multiple(2);
        
        c1.minus(1);
        c2.plus(7);
        
        c1.multiple(7);
        c2.divide(4);
        
        c1.divide(3);
        c2.minus(5);

        System.out.printf("c1.result = %d\n", c1.result);
        System.out.printf("c2.result = %d\n", c2.result);

    }
}