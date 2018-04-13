// character Stream - 문자 배열 출력하기
package step22.ex02;

import java.io.FileWriter;

public class Exam03_1 {
    
    public static void main(String[] args) throws Exception {
        FileWriter out = new FileWriter("temp/test2.txt");
        
        char[] chars = new char[] {'A','B','C','가','각','간','똘','똠','똥'};
        
        out.write(chars, 2, 3); // 2번 문자부터 3 문자를 출력한다.
        
        out.close();
        
        System.out.println("데이터 출력 완료!");
    }
}
