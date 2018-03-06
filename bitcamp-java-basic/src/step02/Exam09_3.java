package step02;

public class Exam09_3 {
    public static void main(String[] args) {
        int[] arr1;

        arr1 = new int[5];

        arr1[0] = 100;
        arr1[1] = 200;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        //int a;
        //System.out.println(a); // 컴파일 오류
        
        // 하지만!!
        // new 명령으로 확보된 메모리는 종류에 상관없이
        // 자동으로 0 으로 초기화 된다.
        // 따라서 값을 넣지 않고도 바로 사용할 수 있다.

        System.out.println(arr1[2]); // 0
        System.out.println(arr1[3]); // 0
        System.out.println(arr1[4]); // 0
    }
}