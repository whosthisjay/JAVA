package Arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {8, 9,-2,-9, 7, 99};
        System.out.print("Minimum Element in array : "+ min(arr));


    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ans > arr[i]) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
