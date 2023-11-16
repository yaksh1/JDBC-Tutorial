import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {
  public static void createEmployee(Employee employee) throws SQLException {
    Connection conn = DB.connect();

    String query = Query.insert;

    PreparedStatement pst = conn.prepareStatement(query);

    pst.setInt(1, employee.getId());
    pst.setString(2, employee.getName());
    pst.setString(3, employee.getMail());
    pst.setInt(4, employee.getSalary());

    pst.execute();
    pst.close();
    System.out.println("Employee created successfully");
  }

  public static void updateEmployee(int salary, int id) throws SQLException {
    Connection conn = DB.connect();

    String query = Query.update;

    PreparedStatement pst = conn.prepareStatement(query);
    pst.setInt(1, salary);
    pst.setInt(2, id);

    pst.execute();
    pst.close();
    System.out.println("Employee updated successfully");
  }

  public static void deleteEmployee(int id) throws SQLException {
    Connection conn = DB.connect();

    String query = Query.delete;

    PreparedStatement pst = conn.prepareStatement(query);
    pst.setInt(1, id);

    pst.execute();
    pst.close();
    System.out.println("Employee deleted successfully");
  }
   
  public static ArrayList<Employee> readAllEmployee() throws SQLException {
    ArrayList<Employee> employees = new ArrayList<>();
    Connection conn = DB.connect();
    String query = Query.select;

    PreparedStatement pst = conn.prepareStatement(query);

    ResultSet rs = pst.executeQuery(query);
    while (rs.next()) {
      Employee employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
      employees.add(employee);
    }
    pst.close();  
    return employees;
   }
  
}
