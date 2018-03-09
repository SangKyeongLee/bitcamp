// 비트 연산자 : >>, >>>, <<
package step04;

public class Exam04_1{
    public static void main(String[] args){
        int i = 1;
        
        System.out.println(i << 1);
        System.out.println(i << 2);
        System.out.println(i << 3);
        System.out.println(i << 4);
        System.out.println("------------");
        // 왼쪽으로 이동 후,
        // 오른쪽 빈자리는 0으로 채운다.
        // 왼쪽 경계를 넘어간 비트는 짜른다. 
        i = 0b0000_1011; // 11
        System.out.println(i << 1); // 22
        System.out.println(i << 2); // 44
        System.out.println(i << 3); // 88
        
    }
}
// 왼쪽 이동
// - 1비트 이동은 곱하기 2 한 것과 같은 효과를 준다.
