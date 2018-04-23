// JDBC 프로그래밍 개요 - JDBC 드라이버 타입과 준비
package step25.ex01;

import java.sql.DriverManager;

// JDBC 드라이버 다운로드 및 설정
public class Exam01_5 {
    
    public static void main(String[] args) throws Exception {
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         java.sql.Driver driver = DriverManager.getDriver("jdbc:mysql:");
         System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
         
         
    }
}
