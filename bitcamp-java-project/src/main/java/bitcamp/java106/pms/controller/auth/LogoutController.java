// 로그인 폼 출력과 사용자 인증처리 서블릿
package bitcamp.java106.pms.controller.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import bitcamp.java106.pms.web.RequestMapping;

@Component("/auth/logout")
public class LogoutController {
    
    @RequestMapping
    public String logout(
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        // 세션을 꺼내 무효화시킨다.
        request.getSession().invalidate();
        
        // 웹 애플리케이션의 시작 페이지로 가라고 웹브라우저에게 얘기한다.
        return "redirect:" +request.getContextPath();
    }
}

//                  [웹브라우저]                                   [웹서버]
// GET 요청: /bitcamp-java-project/auth/login ===>
//                                                         <=== 응답: 로그인폼
// POST 요청: /bitcamp-java-project/auth/login ===>
//                                                         <=== 응답: redirect URL
// GET 요청: /bitcamp-java-project/ ===>
//                                                         <=== 응답: index.html




















