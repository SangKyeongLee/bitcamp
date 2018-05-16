// POST 요청 파라미터의 값이 한글일 경우 깨지는 현상
package step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step03/exam05")
public class Exam05 extends GenericServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void service(
            ServletRequest request, 
            ServletResponse response) throws ServletException, IOException {
        
        // 1) POST 명령으로 보낸 데이터인 경우
        // => 최초로 값을 꺼내기 전에(getParameter()를 최초로 호출하기 전)
        //    클라이언트가 보낸 문자가 어떤 문자코드로 되어 있는지 알려줘야 한다.
        // => 즉 클라이언트로부터 받은 코드를 다음과 같이 바꾼다.
        //    UTF-8: "AB가각" (41 42 ea b0 80 ea b0 81)
        //    String 객체(UTF-16): "AB가각" (0041 0042 AC00 AC01)
        // => 테스트 방법
        //    웹 브라우저에서 다음 HTML을 먼저 띄운 다음에 값을 입력한 후 "전송" 버튼을 눌러라.
        //      http://localhost:8888/bitcamp-web01/step03/exam05_test.html
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        
        response.setContentType("text/plain; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printf("이름=%s\n", name);
        out.printf("나이=%s\n", age);
    }
}

















