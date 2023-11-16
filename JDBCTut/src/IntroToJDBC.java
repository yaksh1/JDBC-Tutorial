import java.sql.*;

public class App {
  public static void main(String[] args) {
    // driver loading --> not necessary

    try {
      String url = "jdbc:mysql://localhost:3306/";
      
   
      String user = "root";
      String password = "ygandhi123";
      
      // connection establishment
      Connection conn = DriverManager.getConnection(url, user, password);
      // statement creation
      Statement st = conn.createStatement();
      // execution of the statement
      String query = "create database my_jdbc_db";
      st.execute(query);
      
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}
