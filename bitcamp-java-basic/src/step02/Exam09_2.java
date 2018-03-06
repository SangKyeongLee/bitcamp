package step02;

public class Exam09_2 {
    public static void main(String[] args) {
        // use array
        int[] arr1 = new int[5];

        arr1[0] = 0;
        arr1[1] = 0;
        arr1[2] = 0;
        arr1[3] = 0;
        arr1[4] = 0;

        // 배열 선언 + 초기화 명령어
        int arr2[] = new int[]{0, 0, 0, 0, 0}; // OK!
        int arr3[] = {0, 0, 0, 0, 0}; // OK!

        // 배열 선언 ==> 초기화 명령
        int[] arr4;
        arr4 = new int[]{0, 0, 0, 0, 0}; // OK!

        //int[] arr5;
        //arr5 = {0, 0, 0, 0, 0}; // NO!


    }
}