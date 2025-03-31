public class Main { public static void main(String[] args) {
 Person person = new Person();
    person.setName("Franz Salazar");
    person.setAge(19);
    person.setCountry("Philippines");
    System.out.println("Person: Name = " + person.getName() + ", Age = " + person.getAge() + ", Country = " + person.getCountry());

Rectangle rectangle = new Rectangle();
    rectangle.setLength(10.5);
    rectangle.setWidth(5.2);
    System.out.println("Rectangle: Length = " + rectangle.getLength() + ", Width = " + rectangle.getWidth());
 
    BankAccount account = new BankAccount();
    account.setAccountNumber(4877371);
    account.setBalance(5000);
    System.out.println("Bank Account: Number = " + account.getAccountNumber() + ", Balance = PHP" + account.getBalance());
 
    Employee employee = new Employee();
    employee.setEmployeeId(101);
    employee.setEmployeeName("Franz Salazar");
    System.out.println("Employee: ID = " + employee.getEmployeeId() + ", Name = " + employee.getEmployeeName() + ", Salary = " + employee.getEmployeeSalary());
}
 
}
 // 1.
class Person { private String name; private int age; private String country;
 
public String getName() {
    return name;
}
 
public void setName(String name) {
this.name = name;
}
 
public int getAge() {
    return age;
}
 
public void setAge(int age) {
    this.age = age;
}
 
public String getCountry() {
    return country;
}
 
public void setCountry(String country) {
this.country = country;
}
 
}
 // 2.
class BankAccount { private int accountNumber; private double balance;
 
public int getAccountNumber() {
    return accountNumber;
}
 
public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
}
 
public double getBalance() {
    return balance;
}
 
public void setBalance(double balance) {
    this.balance = balance;
}
 
}
 // 3.
class Rectangle { private double length; private double width;
 
public double getLength() {
    return length;
}
 
public void setLength(double length) {
    this.length = length;
}
 
public double getWidth() {
    return width;
}
 
public void setWidth(double width) {
    this.width = width;
}
 
}
// 4
class Employee { private int employee_id; private String employee_name; private double employee_salary;
 
public int getEmployeeId() {
    return employee_id;
}
 
public void setEmployeeId(int employee_id) {
    this.employee_id = employee_id;
}
 
public String getEmployeeName() {
    return employee_name;
}
 
public void setEmployeeName(String employee_name) {
    this.employee_name = employee_name;
}
 
public String getEmployeeSalary() {
    return String.format("%.2f", employee_salary);
}
 
}
