package Searching;

public class BinarySearch {
    public static void main(String[] args){
    int[] arr={-18,-12,-4,0,2,3,5,9,15,16,18,23};
    int ans=binarySearch(arr,-3);
    if(ans==-1){
        System.out.print("Element not found!");
    }
    else{
        System.out.print("Element found at Index : "+ans);
        }
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            }else if(target >arr[middle]){
                start=middle+1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
