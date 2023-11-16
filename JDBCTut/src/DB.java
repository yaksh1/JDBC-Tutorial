import java.sql.*;

public class DB {
  private static Connection conn = null;

  public static Connection connect() {
    try{
      String url = "jdbc:mysql://localhost:3306/jdbc_employee";
      String user = "root";
      String password = "ygandhi123";

      conn = DriverManager.getConnection(url, user, password);
    } catch (Exception e) {
      System.out.println(e.toString());
    }
    return conn;
  }
}
