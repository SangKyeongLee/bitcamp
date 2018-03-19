// 클래스 용도 - 사용자 정의 데이터 타입을 만들 때 사용

package step07;

public class Exam01_1 {
    public static void main(String[] args) {
        Score score = new Score();

        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        score.sum = score.kor + score.eng + score.math;
        score.average = (float)score.sum / (float)3;

        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                score.name, score.kor, score.eng, score.math, 
                score.sum, score.average);

    }
}