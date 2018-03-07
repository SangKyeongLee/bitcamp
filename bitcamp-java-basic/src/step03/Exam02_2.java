// 클래스 - 레퍼런스 배열
package step03;

public class Exam02_2 {
    public static void main(String[] args) {
        // 여러 개의 인스턴스 주소 저장하기
        
        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float avg;
        }
        
        Score[] arr = new Score[3];

        arr[0] = new Score();
        arr[1] = new Score();
        arr[2] = new Score();
        
        // 주의!
        // => Score 인스턴스를 3개 만든 것이 아니다.
        // => Score 인스턴스 주소를 저장할 레퍼런스를 3개 만든 것이다.

        arr[0].name = "홍길동";
        arr[1].name = "임꺽정";
        arr[2].name = "유관순";

        System.out.printf("이름: %s\n", arr[0].name);
        System.out.printf("이름: %s\n", arr[1].name);
        System.out.printf("이름: %s\n", arr[2].name);
    }
}

// 클래스(class)
// - '여러 타입'을 묶어서 사용자 정의 데이터 타입을 만드는 문법이다.
// - 관련된 기능(메서드, 함수)을 관리하기 편하게 묶는 문법이다.
//
// 배열(array)
// - '단일한 타입'의 메모리를 묶는 문법이다.