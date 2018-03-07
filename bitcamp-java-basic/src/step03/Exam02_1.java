// 클래스 - 레퍼런스 배열
package step03;

public class Exam02_1 {
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
        
        Score s1, s2, s3;

        s1 = new Score();
        s2 = new Score();
        s3 = new Score();

        // 주의!
        // => Score 인스턴스를 3개 만든 것이 아니다.
        // => Score 인스턴스 주소를 저장할 레퍼런스를 3개 만든 것이다.

        s1.name = "홍길동";
        s2.name = "임꺽정";
        s3.name = "유관순";

        System.out.printf("이름: %s\n", s1.name);
        System.out.printf("이름: %s\n", s2.name);
        System.out.printf("이름: %s\n", s3.name);
    }
}

// 클래스(class)
// - '여러 타입'을 묶어서 사용자 정의 데이터 타입을 만드는 문법이다.
// - 관련된 기능(메서드, 함수)을 관리하기 편하게 묶는 문법이다.
//
// 배열(array)
// - '단일한 타입'의 메모리를 묶는 문법이다.