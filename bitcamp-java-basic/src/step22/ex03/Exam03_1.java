// 데이터 출력 - int값 출력
package step22.ex03;

import java.io.FileOutputStream;

public class Exam03_1 {
    
    public static void main(String[] args) throws Exception {
        // 1) 파일로 데이터를 출력하는 객체를 준비한
        FileOutputStream out = new FileOutputStream("temp/test3.data");
        
        long money = 400_0000_0000_0000L; // = 0x016bcc42e90000        
        
        // long 메모리의 모든 바이트를 출력하려면,
        // 각 바이트를 맨 끝으로 이동한 후 write()로 출력한다.
        // 왜? write()는 항상 변수의 마지막 1바이트만 출력하기 때문이다.
        
        out.write((int)(money >> 56));
        out.write((int)(money >> 48));
        out.write((int)(money >> 40));
        out.write((int)(money >> 32));
        out.write((int)(money >> 24));
        out.write((int)(money >> 16));
        out.write((int)(money >> 8));
        out.write((int)money);
        
        out.close();
        
        System.out.println("데이터 출력 완료!");
    }
}
