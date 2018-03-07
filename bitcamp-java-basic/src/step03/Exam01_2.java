// 클래스 - 사용 후
package step03;

public class Exam01_2 {
    public static void main(String[] args) {

        // 다양한 타입의 메모리를 묶어서 
        // Score라는 새로운 형태의 메모리를 만들 수 있는 설계도.
        // => 개발자가 새롭게 정의한 데이터 타입이다.
        // => "사용자 정의 데이터 타입" 이라 부른다.
        // => 다음과 같이 클래스 문법을 사용하여 설계도를 정의한다.
        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float avg;
        }
        
        // 개발자가 새롭게 정의한 메모리 설계도에 따라 메모리를 준비
        // => 확보된 메모리를 사용하려면 주소를 보관할 필요가 있음
        // => 주소를 보관하려면 레퍼런스가 필요
        Score s; // Score 설계도에 따라 만든 메모리의 주소를 저장할 변수
        s = new Score(); // => Score 설계도에 따라 메모리 확보
                         // 그 메모리의 주소를 s에 저장함

        s.name = "홍길동";
        s.kor = 100;
        s.eng = 90;
        s.math = 80;
        s.sum = s.kor + s.eng + s.math;
        s.avg = s.sum / 3;

        System.out.printf("이름: %s\n", s.name);
        System.out.printf("국어: %d\n", s.kor);
        System.out.printf("영어: %d\n", s.eng);
        System.out.printf("수학: %d\n", s.math);
        System.out.printf("합계: %d\n", s.sum);
        System.out.printf("평균: %.1f\n", s.avg);
    }
}

// 클래스(class)
// - '여러 타입'을 묶어서 사용자 정의 데이터 타입을 만드는 문법이다.
// - 관련된 기능(메서드, 함수)을 관리하기 편하게 묶는 문법이다.
//
// 배열(array)
// - '단일한 타입'의 메모리를 묶는 문법이다.