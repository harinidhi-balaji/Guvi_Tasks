public class Person {
    String name;
    int age;

    // with default age (as you mentioned in question age = 18)
    Person(String name) {
        this.name = name;
        this.age = 18;
    }

    // A person can be initialized with name and age (Initializing both name and age)
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display both name and age
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // creating a person name with specified name and with default age where age =18
        Person p1 = new Person("Harinidhi Balaji");
        p1.display(); // output- Name: Harinidhi Balaji, Age: 18

        // creating a person name with specified name and age
        Person p2 = new Person("Naveen", 24);
        p2.display(); // output- Name: Naveen, Age: 24
    }
}