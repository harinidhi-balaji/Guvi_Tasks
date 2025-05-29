import java.util.*;

//Q1: Custom Exception For Age
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Q1: Custom Exception For Name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Q1: Student class
class Student {
    int rollNo;
    String name;
    int age;
    String course;

    // Parameterized Constructor
    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range (15-21)");
        }
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name should not contain Digits or Special Characters");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

// Q2: Voter class
class Voter {
    int voterId;
    String name;
    int age;

    // Parameterized Constructor
    public Voter(int voterId, String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Invalid age for Voter");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}

// Q4: Student Grade Management using hashMap
class StudentGradeMap {
    HashMap<String, Integer> grades = new HashMap<>();

    // Add a student's name and grade to the HashMap
    public void addStudent(String name, int grade) {
        grades.put(name, grade);
    }

    // Remove the student name
    public void removeStudent(String name) {
        grades.remove(name);
    }

    // Display Grade
    public void displayGrade(String name) {
        if (grades.containsKey(name)) {
            System.out.println("Grades of " + name + ": " + grades.get(name));
        } else {
            System.out.println("Student not found");
        }
    }
}

// Q5: Stack operations using collection
class IntegerStack {
    Stack<Integer> stack = new Stack<>();

    // Pushes an integer element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println(element + "Pushed to stack.");
    }

    // Removes the top element from stack if it's not empty
    public void popElement() {
        if (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        } else {
            System.out.println("Stack is Empty");
        }
    }

    // Checks whether the stack is empty and prints the results
    public void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("Stack is not Empty.");
        }
    }
}

// Main class
public class JavaAdvanceDemo {
    public static void main(String[] args) {

        // Q1: Student Exception Handling
        try {
            Student s1 = new Student(100, "Hari Balaji", 19, "B.sc CS");
            System.out.println("Student one created: " + s1.name);
        } catch (Exception e) {
            System.out.println("Student one Error: " + e.getMessage());
        }
        try {
            Student s2 = new Student(101, "R@gho", 19, "BCA");
            System.out.println("Student two created: " + s2.name);
        } catch (Exception e) {
            System.out.println("Student two Error: " + e.getMessage());
        }

        // Q2: Voter Exception Handling
        try {
            Voter v1 = new Voter(1, "Meena", 17);
        } catch (IllegalArgumentException e) {
            System.out.println("Voter Error: " + e.getMessage());
        }

        // Q3: Weekdays ArrayAccess
        String[] weekdays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day index (0 to 6): ");
        int index = sc.nextInt();

        try {
            System.out.println("Day: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Enter between 0 to 6");
        }

        // Q4: HashMap for Student Grades
        StudentGradeMap gradeMap = new StudentGradeMap();

        gradeMap.addStudent("Hari Balaji", 85);
        gradeMap.addStudent("Ragho", 97);
        gradeMap.addStudent("Meenalochani", 95);
        gradeMap.displayGrade("Hari Balaji");
        gradeMap.displayGrade("Ragho");
        gradeMap.removeStudent("Meenalochani");
        gradeMap.displayGrade("Meenalochani");

        // Q5: Stack operations
        IntegerStack myStack = new IntegerStack();
        myStack.pushElement(10);
        myStack.pushElement(20);
        myStack.popElement();
        myStack.checkIfEmpty();
        myStack.popElement();
        myStack.checkIfEmpty();
    }
}