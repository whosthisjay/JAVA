package Searching;

public  class LinearSearchStringElement {
        // Method to perform linear search and return the element
        public static String linearSearch(String[] arr, String target) {
            // Iterate over the array
            for (String s : arr) {
                // Check if the current element is the target
                if (s.equals(target)) {
                    // Return the element if target is found
                    return s;
                }
            }
            // Return null if target is not found
            return null;
        }

        // Main method to test the linear search
        public static void main(String[] args) {
            // Example array
            String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
            // Target value to search for
            String target = "cherry";

            // Perform the linear search and get the result
            String result = linearSearch(words, target);

            // Print the result
            if (result == null) {
                System.out.println("Element not found in the array.");
            } else {
                System.out.println("Element found: " + result);
            }
        }
    }


