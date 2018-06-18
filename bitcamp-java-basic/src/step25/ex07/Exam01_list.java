package step25.ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exam01_list {
    public static void main(String[] args) throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db",
                "java106", "1111");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(
                "select bno,titl,rdt from ex_board"); 
        while (rs.next()) {
            System.out.printf("%d,%s,%s\n",
                    rs.getInt("bno"),
                    rs.getString("titl"),
                    rs.getDate("rdt"));
        }
        con.close();
        stmt.close();
        rs.close();
    }
}
