import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        
        //Create a list of Strings, Some are Empty
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        //Filter non empty strings & print them
        strings.stream()
            .filter(str -> !str.isEmpty()) //Filter Strings that are not empty
            .forEach(System.out::println); //Print Each non empty string
    }
}
