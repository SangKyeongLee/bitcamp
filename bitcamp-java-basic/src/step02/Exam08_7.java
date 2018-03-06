package step02;

public class Exam08_7 {
    public static void main(String[] args) {
        char ch;
        int i = 0x41;
        ch = (char)i;

        // CANNOT
        boolean bool;
        bool = (boolean)l; //NO!!

        boolean v1 = (boolean)"true"; //NO!!
        char v2 = (char)"가"; //NO!!
        int v3 = (int)"123"; //NO!!
        float v4 = (int) "3.14f"; //NO!!
    }
}