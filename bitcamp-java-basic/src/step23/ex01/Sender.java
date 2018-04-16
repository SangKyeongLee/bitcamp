// 상대편에 연결을 요청하기 - 클라이언트(client)
package step23.ex01;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender {
    
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.0.114", 8888);
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        out.println("이상경입니다. 반갑습니다.");

        String str = in.nextLine();
        System.out.println(str);
        
        in.close();
        out.close();
        
        socket.close();
    }
    
}
