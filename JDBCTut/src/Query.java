public class Query {
  static String insert = "Insert into employee (eid,ename,email,salary) values(?,?,?,?)";
    static String update = "UPDATE employee SET salary = ? where eid = ?";
  static String delete = "DELETE from employee where eid = ?";
  static String select = "select * from employee";

}
