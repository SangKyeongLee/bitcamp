package step02;

public class Exam08_1 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 100;
        int i = 100;
        long l = 100;
        char c = 100;

        byte b2;
        short s2;
        int i2;
        long l2;
        char c2;

        // 컴파일 오류!
        // => 큰 메모리에 들어있는 값을 작은 메모리에 넣을 수 없다.
        b2 = s;
        s2 = i;
        i2 = l;
        c2 = s; // 같은 2바이트여도 유요한 범위가 다르다.
    }
}