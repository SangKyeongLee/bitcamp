// JDBC 프로그래밍 개요 - JDBC 드라이버 타입과 준비
package step25.ex01;

import java.sql.DriverManager;

// JDBC 드라이버 다운로드 및 설정
// 1) 직접 설정하기
// - java-basic/lib 폴더 생성
// - C:\Program Files(x86)\MySQL\Connector j x.x\mysql-connector-java-x.x.jar 복사
// - java-basic/lib 폴더에 붙여넣기
// - 컴파일과 실행할 때 .jar 파일을 사용할 수 있도록 CLASSPATH에 추가한다.
//   project 컨텍스트 메뉴/....>> 강사님 파일 확인
public class Exam01_1 {
    
    public static void main(String[] args) throws Exception {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
    }
}
