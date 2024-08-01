package Searching;

public class LinearSearchIndex {
    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        // Iterate over the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is the target
            if (arr[i] == target) {
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
        int[] numbers = {10, -1,20, 30, 40, 50};
        // Target value to search for
        int target = -1;

        // Perform the linear search and get the result
        int result = linearSearch(numbers, target);

        // Print the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
