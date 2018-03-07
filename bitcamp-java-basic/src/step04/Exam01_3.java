// 산술 연산자 : 암시적 형변환
package step04;

public class Exam01_3{
    public static void main(String[] args){
        // 리터럴 5, 6은 4바이트 정수 값이다.
        // 리터럴끼리 산술 연산한 결과도 리터럴로 간주한다.
        // 즉 컴파일 단계에서 그 값이 얼마인지 확인할 수 있기 때문이다.
        // 변수의 경우는 컴파일 단계에서 값을 확인할 수 없다.
        // 정수 리터럴은 기본이 4바이트 크기이지만, 
        // byte 변수에 저장할 수 있다면 허락한다!
        byte b = 5 + 6;

        byte x = 5, y = 6, z;
        //z = x + y; // 컴파일 오류!
        
        // short도 마찬가지이다.
        short s1 = 5;
        short s2 = 6;
        short s3 = s1 + s2;
    }
}