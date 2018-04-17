// HTTP 서버 만들기
package step23.ex07;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HttpServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(80);
        
        while (true) {
            Socket socket = ss.accept();
            Scanner in = new Scanner(socket.getInputStream());
            PrintStream out = new PrintStream(socket.getOutputStream());
            
            while (true) {
                String str = in.nextLine();
                System.out.println(str);
                if (str.equals(""))
                    break;
            }
            
            out.println("HTTP/101 200 OK");
            out.println("Content-Type: text/html; charset=UTF-8");
            out.println();
            out.println("<html><body><h1>안녕!-이상경</h1></body></html>");
            
            out.close();
        }
    }
}
