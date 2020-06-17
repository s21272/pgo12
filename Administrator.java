import java.util.ArrayList;

public class Administrator extends Employee {
    private static int COUNTER = 0;
    private ArrayList <Employee> employees;
    public Administrator( String name, String surname) {
        super(name, surname);
        this.employeeID = COUNTER++;
    }

    public Employee createEmployee(String name, String surname){
        Employee e = new Employee(name, surname);
        employees.add(e);
        return e;
    }

    public void removeEmployee (Employee e){
        employees.remove(e);
    }

}
