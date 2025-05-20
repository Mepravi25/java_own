class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}
class Emp extends Person{
    int empID;
    void detail(){

    }
}

public class super {
    public static void main(String[] args) {
        
    }
}
// Superclass
class Person {
    String name;
    
    // Parameterized constructor
    public Person(String name) {
        this.name = name;
    }
}

// Subclass
class Employee extends Person {
    int employeeId;
    
    // Constructor using super keyword
    public Employee(String name, int employeeId) {
        super(name);  // Calls Person's constructor
        this.employeeId = employeeId;
    }
    
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 1001);
        
        // Display employee details
        emp.displayDetails();
    }
}