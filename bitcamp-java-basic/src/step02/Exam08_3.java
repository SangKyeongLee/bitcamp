package step02;

public class Exam08_3 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 100;
        int i = 98765678;
        long l = 98765678;
        char c = 100;
    
        float f;
        double d;

        f = b; // byte(1byte) ==> float(4byte). 값을 그대로 저장.
        System.out.println(f);

        f = s; // short(2byte) ==> float(4byte). 값을 그대로 저장.
        System.out.println(f);

        f = c; // char(2byte) ==> float(4byte). 값을 그대로 저장.
        System.out.println(f);

        f = i; // int(4byte) ==> float(4byte). 
               // 가수부 크기(23비트)를 넘는 정수는 짤린다.
               // 즉 유효자릿수를 넘는 정수는 짤린다.
               // 주의! 컴파일 오류가 발생하지 않는다.
        System.out.println(f);

        f = l; // long(8byte) ==> float(4byte). 
               //가수부 크기(23비트)를 넘는 정수는 짤린다.
               // 즉 유효자릿수를 넘는 정수는 짤린다.
               // 주의! 컴파일 오류가 발생하지 않는다.
        System.out.println(f);

        d = i; // int(4byte) ==> double(8byte)
               // double 의 가수부는 53의 크기를 갖는다.
               // 따라서 int(32비트) 값을 그대로 저장할 수 있다.
        System.out.println(d);

        l = 18_2345_3456_4567_5678L; //53비트가 넘어가는 정수
        d = l; // long(8byte) ==> double(8byte)
               // long(64비트) 값을 double 메모리에 저장할 때
               // 53비트를 넘어가면 짤린다.
               // 주의! 컴파일 오류가 발생하지 않는다.
        System.out.println(d);
    }
}