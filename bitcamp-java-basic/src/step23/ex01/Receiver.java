// 상대편으로부터 연결 요청 받기 - 서버(server)
package step23.ex01;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Receiver {
    
    public static void main(String[] args) throws Exception {
        
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        String str = in.nextLine();
        System.out.printf("상대편> %s\n", str);

        out.println("이상경입니다. 안녕하세요!");
        
        in.close();
        out.close();
        
        socket.close();
        serverSocket.close();
    }
    
}
