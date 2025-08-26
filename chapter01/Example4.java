
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

        // Remove an element by value
        numbers.remove(Integer.valueOf(8)); // Remove the element '8'

        // Checked if a LinkedList contains an element
        boolean containsThree = numbers.contains(3);
        System.out.println("LinkedList contains 3: " + containsThree);
        boolean containsEight = numbers.contains(8);
        System.out.println("LinkedList contains 3: " + containsEight);
        
        // Iterate through the LinkedList
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}