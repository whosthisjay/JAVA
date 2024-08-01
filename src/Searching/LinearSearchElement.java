package Searching;

public class LinearSearchElement {
        // Method to perform linear search and return the element
        public static Integer linearSearch(int[] arr, int target) {
            // Iterate over the array
            for (int j : arr) {
                // Check if the current element is the target
                if (j == target) {
                    // Return the element if target is found
                    return j;
                }
            }
            // Return null if target is not found
            return null;
        }

        // Main method to test the linear search
        public static void main(String[] args) {
            // Example array
            int[] numbers = {10,-1, 20, 30, 40, 50};
            // Target value to search for
            int target = -1;

            // Perform the linear search and get the result
            Integer result = linearSearch(numbers, target);

            // Print the result
            if (result == null) {
                System.out.println("Element not found in the array.");
            } else {
                System.out.println("Element found: " + result);
            }
        }
    }

