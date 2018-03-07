// 레퍼런스와 인스턴스 - 가비지
package step03;

public class Exam03_1 {
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
        
        Score s1;

        // 인스턴스를 만들어 그 주소를 레퍼런스에 저장한다.
        s1 = new Score();

        // 새 인스턴스를 만들어 s1에 주소를 저장한다.
        s1 = new Score();

        // 그러면 기존에 있던 주소는 잃어 버린다.
        // 주소를 잃어버려 사용할 수 없는 메모리를 "가비지(garbage)"라 부른다.

        // 가비지는 가비지 컬렉터에 의해 메모리에서 해제된다.
    }
}

// 클래스(class)
// - '여러 타입'을 묶어서 사용자 정의 데이터 타입을 만드는 문법이다.
// - 관련된 기능(메서드, 함수)을 관리하기 편하게 묶는 문법이다.
//
// 배열(array)
// - '단일한 타입'의 메모리를 묶는 문법이다.