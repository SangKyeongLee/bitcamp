// 클래스 사용 - 패키지 클래스 사용
package step03;

public class Exam04_1 {
    public static void main(String[] args) {
    
        // 바깥 쪽에 별도 선언한 클래스를 사용하기
        step03.Score s1 = new step03.Score();
        s1.name = "홍길동";
        System.out.println(s1.name);

    }
}

// Exam04_1.java 컴파일 오류!
// > javac -encoding UTF-8 -d bin src/step03/Exam04_1.java // 컴파일 오류!
// 이유?
// 컴파일할때 Score 클래스 정보가 필요하다.

// 방법1) Score.class 파일을 갖고 있다면 그 파일의 위치를 알려줘라.
// > javac -encoding UTF-8 -d bin -classpath bin src/step03/Exam04_1.java

// 방법2) Score 클래스의 소스 파일이 있다면 소스 파일의 위치를 알려줘라.
// > javac -encoding UTF-8 -d bin -sourcepath src src/step03/Exam04_1.java
