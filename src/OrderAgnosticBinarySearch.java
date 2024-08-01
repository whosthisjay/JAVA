public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // Example arrays
         int[] arr = {-18, -12, -4, -2, 3, 5, 9, 15, 16, 18, 23};
//        int[] arr = {9, 8, 7, 4, 1, 0, -1, -2, -6, -9, -87};
        int ans = orderAgnosticBinarySearch(arr, -2);
        if (ans == -1) {
            System.out.print("Element not found!");
        } else {
            System.out.print("Element found at Index: " + ans);
        }
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Determine whether the array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (isAsc) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else {  // This should be "else if", corrected here
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else {  // This should be "else if", corrected here
                    start = middle + 1;
                }
            }
        }

        return -1;  // Element not found
    }
}
