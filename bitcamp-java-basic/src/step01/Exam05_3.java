package step01;

public class Exam05_3 {
    public static void main(String[] args) {
        // 4byte
        System.out.println(2147483647);
        System.out.println(-2147483648);

        // 4byte 초과시 숫자 뒤에 대문자 L을 붙인다.
        System.out.println(2147483648L);
        System.out.println(-2147483649L);

        System.out.println(Integer.MAX_VALUE);//4byte
        System.out.println(Integer.MIN_VALUE);//4byte
        System.out.println(Long.MAX_VALUE);//8byte
        System.out.println(Long.MIN_VALUE);//8byte

        // 다음은 크기가 다른 정수이다.
        System.out.println(100); // 4byte
        System.out.println(100L); // 8byte
    }
}