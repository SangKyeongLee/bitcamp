// 객체 읽기 - 
package step22.ex04;

import java.io.FileInputStream;

public class Exam02_2 {
    
    public static void main(String[] args) throws Exception {
        DataInputStream in = new DataInputStream("temp/test4_2.data");

        Member member = null;
        
        member = new Member();
        // 1) 이름 읽기
        member.name = in.readUTF();
        
        // 2) 나이 읽기
        member.age = in.readInt();
        
        // 3) 성별 읽기
        member.gender = in.readBoolean();
        
        in.close();
        
        System.out.printf("%s\n", member);
    }
}