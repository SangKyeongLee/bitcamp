// 사용자 정의 데이터 타입 - 인스턴스 메서드
package step07;

public class ExamX_3 {
    public static void main(String[] args) {
        Score3 score = new Score3();
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        
        //Score2.calculate(score);
        score.calculate(); // 변수 뒤에 연산자를 놓는  i++ 의 예와 비슷하다.
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                score.name, score.kor, score.eng, score.math, 
                score.sum, score.average);

    }
}