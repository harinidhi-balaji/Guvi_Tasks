import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        // List of 10 Students name
        List<String> students = Arrays.asList("Amit", "Ram", "Krishna", "Anjali",
                "Hari", "Archana", "Anu", "Ajay", "Raja", "Akash");

        // filter and Print names that starts with 'A'
        students.stream()
                .filter(name -> name.startsWith("A")) // Condition: Name must starts with 'A'
                .forEach(System.out::println); // Print Eligible Names
    }
}
