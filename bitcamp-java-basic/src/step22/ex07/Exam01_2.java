// 객체 읽기 - 
package step22.ex07;

import java.io.FileInputStream;

import step22.ex06.Member;

public class Exam01_2 {
    
    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = new FileInputStream("temp/test7.data");
        
        // FileInputStream 객체에 String,int,boolean 값을 읽는
        // 플러그인/장신구/보조장치(decorator)를 장착한다.
        DataInputStream in = new DataInputStream(fileIn);

        Member member = new Member();

        // 플러그인을 통해 String, int, boolean 값을 읽는다.
        member.name = in.readUTF();
        member.age = in.readInt();
        member.gender = in.readBoolean();
        
        in.close();
        
        System.out.printf("%s\n", member);
    }
}