package testPackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// 1, 2, 3, 4, 5 big 2 no

// Hands-on programming with Java 8 features & Collection classes

class Greatest2Numbers {
    public static void main(String[] args) {
        
    	List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 6, 6, 7, 2);
    	
    	// Finding the largest number using Stream API
        Optional<Integer> Largest = numbers.stream()
                .distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort the stream in descending order
                .findFirst(); // Find the second largest number

        // Finding the second largest number using Stream API
        Optional<Integer> secondLargest = numbers.stream()
                .distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort the stream in descending order
                .skip(1) // Skip the largest number
                .findFirst(); // Find the second largest number

        // Displaying the second largest number
        Largest.ifPresent(number -> System.out.println("Largest Number: " + number));
        
        // Displaying the second largest number
        secondLargest.ifPresent(number -> System.out.println("Second Largest Number: " + number));
    }
}