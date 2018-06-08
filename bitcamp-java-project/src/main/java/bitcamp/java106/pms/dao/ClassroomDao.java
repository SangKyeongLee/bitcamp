package bitcamp.java106.pms.dao;

import java.util.List;
import java.util.Map;

import bitcamp.java106.pms.domain.Classroom;

public interface ClassroomDao {
    int delete(int no);
    List<Classroom> selectList(Map<String,Object> params);
    int insert(Classroom classroom);
    int update(Classroom classroom);
    Classroom selectOne(int no);
}

//ver 24 - File I/O 적용
//ver 23 - @Component 애노테이션을 붙인다.
//ver 22 - 추상 클래스 AbstractDao를 상속 받는다.
//ver 20 - 클래스 추가




