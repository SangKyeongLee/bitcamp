// 메서드 : 스택 메모리 응용 III - 스택 오버플로우
package step06;

public class Exam04_6 {
    
    static int sum(int value) {
        // 종료 조건이 없으면 발생
        long a1, a2, a3, a4, a5, a6, a7, a8 ,a9, a10;
        long a11, a21, a31, a41, a51, a61, a71, a81, a91, a101;
        long a111, a211, a311, a411, a511, a611, a711, a811 ,a911, a1110;
        System.out.println(value);
        return value + sum(value - 1);
    }
    public static void main(String[] args) {

        System.out.println(sum(5));
    }
}
