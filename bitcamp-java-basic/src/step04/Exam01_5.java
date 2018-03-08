// 산술 연산자 : 연산의 결과 타입
package step04;

public class Exam01_5{
    public static void main(String[] args){
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5.5f;
        double d = 6.6;
        char c = 7;

        // > byte + byte = int
        // byte r1 = b + b; // Error!

        // > short + short = int
        // short r2 = s + s; // Error!

        // > byte + short = int
        // short r3 = b + s; // Error!

        // > byte + int = int
        int r4 = b + i; // OK

        // > short + int = int
        int r5 = s + i; // OK

        // > int + long = long
        // int r6 = i + l; // Error;

        // > long + float = float
        //long r7 = l + f; // Error!

        // > int + float = float
        //int r8 = i + f; // Error!

        // > float + double = double
        //float r9 = f + d; // Error!

        // > byte + short + int + long + float + double = double
        long r10 = b + s + i + l + f + d; // Error!

        // float + int + long = float
        long r11 = f + i + l; // Error!

    }
}