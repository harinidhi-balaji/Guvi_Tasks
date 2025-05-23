//Base class
//Note: The class is named Person1 instead of Person
//because there is already a class named Person in the same package
//Renaming avoid class name conflicts and compilation errors

class Person1{  
    String name;
    int age;

    //Constructor for person1
    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Method to display Person1 Details
    public void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

//Sub class employee inherits from person
class Employee extends Person1{
    int employeeId;
    double salary;

    //Constructor for employee - uses super to initialize person attributes
    public Employee(String name, int age, int employeeId, double salary){
        super(name, age); //Initialize name and age in person1 class
        this.employeeId = employeeId;
        this.salary = salary;
    }

    //Method to display Employee Details
    public void displayEmployee(){
        displayPerson(); // Call method from person class
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

//Main class to test
public class PersonEmployeeMain {
    public static void main(String[] args) {
        //Create an employee object because employee class inherits from person1
        Employee emp1 = new Employee("Harinidhi Balaji", 25, 14841, 25000);
        Employee emp2 = new Employee("Naveen Kumar", 25, 14842, 25000);
        Employee emp3 = new Employee("Kandharaja", 43, 12011, 60000);

        //display details
        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();
    }
}
