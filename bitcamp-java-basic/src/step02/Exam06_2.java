package step02;

public class Exam06_2 {
    public static void main(String[] args) {
        char c1, c2;
        c1 = 0x41; // A (UTF-16)
        c2 = 65; // A (UTF-16)

        System.out.println(c1);
        System.out.println(c2);

        char c3;
        c3 = '하';
        System.out.println(c3);
    }
}