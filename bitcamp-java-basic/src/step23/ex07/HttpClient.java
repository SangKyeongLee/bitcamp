// HTTP 클라이언트 만들기
package step23.ex07;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

// HTTP 프로토콜 요청 프로토콜
// -------------------------------
// GET [자원주소] HTTP/1.1(CRLF)
// Host: [서버주소] (CRLF)
// (CRLF)
// -------------------------------

// 프로토콜(protocol)
// => 클라이언트/서버 간의 통신 규칙
// => 데이터를 주고 받는 규칙.
public class HttpClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("www.naver.co.kr", 80);
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        out.println("GET /main/read.nhn?oid=025&sid1=104&aid=0002813853&mid=shm&mode=LSD&nh=20180417105840");
        out.println("Host: www.naver.com");
        out.println();
        
        while (true) {
            try {
                System.out.println(in.nextLine());
            } catch (Exception e) {
                break;
            }
        }
        
        out.close();
        in.close();
        socket.close();
    }
}
