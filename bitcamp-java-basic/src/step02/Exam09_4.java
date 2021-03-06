package step02;

public class Exam09_4 {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[]{100, 200, 300};

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        
        // New array
        // 새로운 int 배열을 확보하여 arr1 레퍼런스에 그 주소를 저장한다.
        // => arr1 변수에는 새 배열의 주소가 저장된다.
        // => 그러면 이전 배열의 주소는 잃어 버린다.
        // => 주소를 잃어버린 배열은 사용할 수 없다.
        // => 이렇게 사용할 수 없는 메모리(인스턴스)를 가비지(garbage)라 부른다.
        arr1 = new int[]{10, 20, 30, 40, 50};
        
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        
    }
}
// 가비지(garbage)?
// - 주소를 잃어버려 사용할 수 없는 메모리(인스턴스)
// - JVM을 종료하면 어차피 OS에게 사용한 메모리를 반납해야 하기 때문에
//   자동으로 해제된다.
// - 그러나 JVM이 실행하는 중에 개발자가 임의로 해제할 수 없다.
// - 오직 가비지 컬렉터(garbage collector)만이 가비지를 해제할 수 있다.
//
// 가비지 컬렉터(garbage collector)?
// - 인스턴스의 주소를 알고 있는 변수가 없을 경우
//   그 인스턴스는 가비지로 간주된다.
// - 가비지 메모리를 재사용할 수 있도록 해제시키는 방법
//   => 개발자가 임의로 해제 불가능하다.
//   => 가비지 컬렉터가 실행되어야만 해제시킬 수 있다.
// 
// 가비지 컬렉터의 실행
// - 다음의 경우에 가비지 컬렉터가 실행되어 가비지들이 해제된다.
// 1) 메모리가 부족할 경우
// 2) CPU가 한가할 때 
// 3) 개발자가 가비지 컬렉터를 실행하라고 명령을 내릴 경우
// 
// 결론!
// - 가비지는 가비지 컬렉터가 자기 나름의 조건에 따라 실행할 것이니, 
//   개발자는 신경쓰지 말라!
//
// 가비지 컬렉션(garbage collection)?
// - 가비지 컬렉터를 통해서 가비지를 해제시키는 것.
//
// 가비지 컬렉션 방식의 문제점?
// - 가비지 컬렉터가 실행되기 전까지는 일정 시간 쓰레기 메모리가 유지된다.
// - 메모리 사용률을 극한으로 끌어 올릴 수 없다.
// - 근데 너무 메모리 사용에 대해 짜게 굴지말라!
//   왜?
//   요즘 메모리 값이 싸다!