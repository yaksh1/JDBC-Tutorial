import java.sql.*;

public class Student {
  public void createDB() {
    try{
      String url="jdbc:mysql://localhost:3306/";
      String user = "root";
      String password = "ygandhi123";
      //connection
      Connection conn = DriverManager.getConnection(url, user, password);
      // statement
      Statement st = conn.createStatement();
      //execute
      String query = "create Database student";
      st.execute(query);
      //close connection
      conn.close();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }

  public void createTable() {
        try{
          String url = "jdbc:mysql://localhost:3306/";
          String db = "student";
      String user = "root";
      String password = "ygandhi123";
      //connection
      Connection conn = DriverManager.getConnection(url+db, user, password);
      // statement
      Statement st = conn.createStatement();
      //execute
      String query = "create TABLE student(sid int(3),sname varchar(200),semail varchar(200))";
      st.execute(query);
      //close connection
      conn.close();
      System.out.println("Table Created Successfully");
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
  //! <---- CRUD operations -----> //
  public void createData() {
      try{
          String url = "jdbc:mysql://localhost:3306/";
          String db = "student";
      String user = "root";
      String password = "ygandhi123";
      //connection
      Connection conn = DriverManager.getConnection(url+db, user, password);
      // statement
      Statement st = conn.createStatement();
      //execute
      String query = "Insert into student(sid,sname,semail) values(2,'rahul','r@gmail.com')";
      st.execute(query);
      //close connection
      conn.close();
      System.out.println("Data inserted Successfully");
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }

  public void readData() {
    try {
      String url = "jdbc:mysql://localhost:3306/";
      String db = "student";
      String user = "root";
      String password = "ygandhi123";
      //connection
      Connection conn = DriverManager.getConnection(url + db, user, password);
      // statement
      Statement st = conn.createStatement();
      //execute
      String query = "select*from student";
      ResultSet rs = st.executeQuery(query); // returns result set
      // printing the data stored in the table
      while (rs.next()) {
        System.out.println(rs.getInt(1) + "|" + rs.getString(2) + "|" + rs.getString(3));
      }
      //close connection
      conn.close();
      System.out.println("Data read Successfully");
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }

  public void updateData() {
        try {
      String url = "jdbc:mysql://localhost:3306/";
      String db = "student";
      String user = "root";
      String password = "ygandhi123";
      //connection
      Connection conn = DriverManager.getConnection(url + db, user, password);
      // query
      String query = "Update student set semail = ? where sname = ?";
      //statement
      PreparedStatement pst = conn.prepareStatement(query);
      pst.setString(1, "yaksh@gmail.com");
      pst.setString(2, "yaksh");
        
      pst.executeUpdate();
     
      //close connection
      conn.close();
      System.out.println("Data updated Successfully");
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}
