// 메서드 : 개념 및 기본 문법 IV
package step06;

import java.util.Scanner;

public class Exam02_4 {

    // 4) 메서드 : 리턴값(o), 파라미터(o)
    // => "이 돈 갖고 과자좀 사와!"
    static String hello(String name, int age) {
        String retVal = String.format("%d살 %s님을 환영합니다!", age, name);
        return retVal;
    }

    public static void main(String[] args) {

        String r = hello("홍길동", 20);
        System.out.println(r);

        // 리턴 값을 안 받아도 된다.
        hello("임꺽정", 10); // 리턴 값은 버려진다.
    }
}