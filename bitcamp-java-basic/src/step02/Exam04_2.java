package step02;

public class Exam04_2 {
    public static void main(String[] args) {
        int i = 100;
        byte b = 100;
        
        // i = Integer, b = Byte i not b
        // b = i;

        short s = 100;
        // s = i;

        int j = 100;
        j = i; // i = Integer, j = Integer => i = j

        long l = 100;
        l = i; // OK. l = long, long > Integer. l <= i

        int k = 100;
        //k = l; // NO. k = Integer, l = long. k <= l CAN'T
    }
}