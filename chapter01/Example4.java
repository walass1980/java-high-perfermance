
import java.util.LinkedList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        List<Integer> numbers = new  LinkedList<>();

        // Add elements to tht LinkedList
        numbers.add(3);
        numbers.add(2);
        numbers.add(8);
        numbers.add(9);

        // Iterate through the LinkedList
        System.out.println("Initial LinkedList elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}