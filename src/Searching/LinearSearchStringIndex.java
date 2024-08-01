package Searching;

public class LinearSearchStringIndex {
        // Method to perform linear search and return the index
        public static int linearSearch(String[] arr, String target) {
            // Iterate over the array
            for (int i = 0; i < arr.length; i++) {
                // Check if the current element is the target
                if (arr[i].equals(target)) {
                    // Return the index if target is found
                    return i;
                }
            }
            // Return -1 if target is not found
            return -1;
        }

        // Main method to test the linear search
        public static void main(String[] args) {
            // Example array
            String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
            // Target value to search for
            String target = "cherry";

            // Perform the linear search and get the result
            int result = linearSearch(words, target);

            // Print the result
            if (result == -1) {
                System.out.println("Element not found in the array.");
            } else {
                System.out.println("Element found at index: " + result);
            }
        }
    }

