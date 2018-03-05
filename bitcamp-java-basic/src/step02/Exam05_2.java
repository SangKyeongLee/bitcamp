package step02;

public class Exam05_2 {
    public static void main(String[] args) {
        float f;
        double d;

        f = 9876.98769876f;// 4byte
        d = 9876.98769876f;
        System.out.println(f);
        System.out.println(d);

        f = 9876.98769876f;
        d = 9876.98769876;
        System.out.println(f);
        System.out.println(d);

        //f = 9876.98769876;// NO

    }
}