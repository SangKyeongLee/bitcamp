// 제네릭(Generic) - 문법 정리
package step13.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam01_3 {
    public static void main(String[] args) {
        // 문법
        // => 클래스명 옆에 다루고자 하는 타입의 이름을 지정한다.
        //    클래스명<타입명>
        ArrayList<Member> list = new ArrayList<Member>();
        list.add(new Member("홍길동",20));
        
        // => 레퍼런스 선언에 제네릭 정보가 있다면 new 연산자에서는 생략할 수 있다.
        ArrayList<Member> list2 = new ArrayList</*Member*/>();
        list.add(new Member("홍길동",20));
    }
}
