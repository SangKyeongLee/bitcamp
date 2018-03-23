// 상속 - 기본 생성자 호출 확인
package step11.ex07;

public class Exam01 {
    public static void main(String[] args) {
        B obj = new B();
        obj.v1 = 100;
        obj.v2 = 200;
        System.out.printf("v1 = %d, v2 = %d", obj.v1, obj.v2);
    }
}

