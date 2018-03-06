package step02;

public class Exam09_1 {
    public static void main(String[] args) {
        // before array
        int i1, i2, i3, i4, i5;

        // use array
        int[] arr1 = new int[5];
        int arr2[] = new int[5]; // C-style.

        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;
        arr1[3] = 400;
        arr1[4] = 500;

        arr1[5] = 600; // Compile OK But! Play Error
    }
}