package step25.ex01;

import java.sql.DriverManager;

public class Exam03_6 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
        
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");
        System.out.println("DBMS와 연결됨!");
        
        java.sql.Statement stmt = con.createStatement();
        
        int count = stmt.executeUpdate(
                "delete from ex_board where bno=13"); 
        System.out.printf("%d 개 삭제 성공!", count);
        
        con.close();
        stmt.close();
    }
}
