package Arrays;

public class FindMax {
        public static void main(String[] args) {
            int[] arr = {8, 9,-2,-9, 7, 99};
            System.out.print("Maximum Element in array : "+ max(arr));

        }

        static int max(int[] arr) {
            int ans = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (ans < arr[i]) {
                    ans = arr[i];
                }
            }
            return ans;
        }
    }

