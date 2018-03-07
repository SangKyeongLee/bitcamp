// 클래스 - 레퍼런스 배열
package step03;

public class Exam02_3 {
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

        for(int i = 0; i < arr.length; i++){
            arr[i] = new Score();
        }
        
        // 주의!
        // => Score 인스턴스를 3개 만든 것이 아니다.
        // => Score 인스턴스 주소를 저장할 레퍼런스를 3개 만든 것이다.

        arr[0].name = "홍길동";
        arr[1].name = "임꺽정";
        arr[2].name = "유관순";

        for(int i = 0; i < arr.length; i++){
            System.out.printf("이름: %s\n", arr[i].name);
        }
    }
}

// 결론!
// - 배열은 반복문과 함께 쓸 때 특히 유용하다.