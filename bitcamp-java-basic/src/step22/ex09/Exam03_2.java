// Java I/O API 사용하기 - Serialize의 대상 클래스가 변경된 경우
package step22.ex09;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam03_2 {
    
    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = new FileInputStream("temp/test9_4.data");
        BufferedInputStream bufIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(bufIn);
        
        Member3 member = (Member3)in.readObject();

        in.close();
        
        System.out.println(member);
    }
}

// 용어 정리!
// Serialize   : 객체 ===> 바이트 배열 (marshalling 이라고도 부른다.)
// Deserialize : 바이트배열 ===> 객체  (unmarshalling 이라고도 부른다.)







