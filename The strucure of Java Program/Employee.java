package lab1;
public class Employee {
  
      protected int id;
      protected int age;
      protected String name;
     boolean isPermanent;
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.id = 101;
        emp.name = "John Doe";
        emp.isPermanent = true;
        emp.age = (int) 35.5;
        System.out.println("Successfully started");
    }
}