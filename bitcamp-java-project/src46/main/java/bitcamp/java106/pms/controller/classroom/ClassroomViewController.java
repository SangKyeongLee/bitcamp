package bitcamp.java106.pms.controller.classroom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import bitcamp.java106.pms.controller.PageController;
import bitcamp.java106.pms.dao.ClassroomDao;
import bitcamp.java106.pms.domain.Classroom;

@Component("/classroom/view")
public class ClassroomViewController implements PageController {
    
    ClassroomDao classroomDao;
    
    public ClassroomViewController(ClassroomDao classroomDao) {
        this.classroomDao = classroomDao;
    }
    
    @Override
    public String service(
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
     
        int no = Integer.parseInt(request.getParameter("no"));
        Classroom classroom = classroomDao.selectOne(no);

        if (classroom == null) {
            throw new Exception("유효하지 않은 강의입니다.");
        }
        request.setAttribute("classroom", classroom);
        return "/classroom/view.jsp";
    }
}

//ver 46 - 페이지 컨트롤러를 POJO를 변경
//ver 45 - 프론트 컨트롤러 적용
//ver 42 - JSP 적용
//ver 39 - forward 적용
//ver 37 - 컨트롤러를 서블릿으로 변경
//ver 31 - JDBC API가 적용된 DAO 사용
//ver 28 - 네트워크 버전으로 변경
//ver 26 - TeamController에서 view() 메서드를 추출하여 클래스로 정의.
//ver 23 - @Component 애노테이션을 붙인다.
//ver 22 - TaskDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 18 - ArrayList가 적용된 TeamDao를 사용한다.
//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
// ver 15 - TeamDao를 생성자에서 주입 받도록 변경.
// ver 14 - TeamDao를 사용하여 팀 데이터를 관리한다.
// ver 13 - 시작일, 종료일을 문자열로 입력 받아 Date 객체로 변환하여 저장.