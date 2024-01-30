class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String employeeId;
    double salary;

    public Employee(String name, int age, String employeeId, double salary) {
        
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
}

public class P18_EmployConstr {
    public static void main(String[] args) {
        Person personObj = new Person("John", 25);
        Employee employeeObj = new Employee("Alice", 30, "EMP123", 50000);

        // Accessing attributes of the base class (Person) using the derived class (Employee)
        System.out.println("Person Object:");
        System.out.println("Name: " + personObj.name);
        System.out.println("Age: " + personObj.age);

        System.out.println("\nEmployee Object:");
        System.out.println("Name: " + employeeObj.name);
        System.out.println("Age: " + employeeObj.age);
        System.out.println("Employee ID: " + employeeObj.employeeId);
        System.out.println("Salary: " + employeeObj.salary);
    }
}
