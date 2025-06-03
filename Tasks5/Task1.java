import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {

        // Create a Stream of Strings with mixed case letters
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Convert each String to UpperCase using map and print then
        names.map(String::toUpperCase).forEach(System.out::println); // Transform Each String to Uppercase
    }
}