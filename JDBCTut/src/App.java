import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws SQLException {
    int i = 1;
    Scanner in = new Scanner(System.in);
    while (i == 1) {
      System.out.println("Select Operation: 1.Create 2.Update 3.Delete 4.Read");
      int op = in.nextInt();
      switch (op) {
        case 1: {
          System.out.println("Enter the details of the employee:");
          System.out.println("id | name | email | salary");
          int id = in.nextInt();
          String name = in.next();
          String email = in.next();
          int salary = in.nextInt();
          Employee emp = new Employee(id, name, email, salary);
          EmployeeDAO.createEmployee(emp);
          break;
        }
        case 2: {
          System.out.println("id | salary");
          int id = in.nextInt();
          int salary = in.nextInt();
          EmployeeDAO.updateEmployee(salary, id);
          break;
        }
        case 3: {
          System.out.println("Enter the id to delete an employee");
          int id = in.nextInt();
          EmployeeDAO.deleteEmployee(id);
          break;
        }
        case 4: {
          ArrayList<Employee> list = EmployeeDAO.readAllEmployee();
          for (Employee emp : list) {
            System.out.println(emp);
          }
          break;
        }
        default:
          System.out.println("Invalid choice");

      }
      System.out.print("Do you wish to continue (if yes -> 1, if no -> 0):");
      i = in.nextInt();
    }
  }
}
