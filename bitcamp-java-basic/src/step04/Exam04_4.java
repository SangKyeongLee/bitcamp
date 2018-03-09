// 비트 이동 연산자 : 응용 I
package step04;

public class Exam04_4{
    public static void main(String[] args){
        int i = 0x27a130ff;
        System.out.println(Integer.toHexString(i));
        System.out.println("-----------");
        // i 변수에 들어있는 값을 1바이트씩 짤라서 16진수로 출력하라!
        System.out.println(Integer.toHexString(i >> 24));
        System.out.println(Integer.toHexString(i >> 16 & 0xff));
        System.out.println(Integer.toHexString(i >> 8 & 0xff));
        System.out.println(Integer.toHexString(i & 0xff));
    }
}
