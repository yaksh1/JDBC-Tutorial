public class Employee {
  private String ename;
  private String email;
  private int eid;
  private int salary;

  Employee(int eid, String ename, String email, int salary) {
    this.eid = eid;
    this.ename = ename;
    this.email = email;
    this.salary = salary;
  }

  public int getId() {
    return this.eid;
  }

  public String getName() {
    return ename;
  }

  public String getMail() {
    return email;
  }

  public int getSalary() {
    return salary;
  }


  public String toString() {
    return "Employee:[ id:" + this.eid + " name:" + this.ename + " email:" + this.email + " salary:" + this.salary
        + "] ";
  }
}
