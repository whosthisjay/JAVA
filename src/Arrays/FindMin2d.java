package Arrays;

public class FindMin2d {
        public static void main(String[] args){
            int[][] arr={
                    {1,2,4,5,0,-1},
                    {2,7,9,0},
                    {1,7,9,0,6,-99,2}
            };
            System.out.print("Minimum element in 2d araray :"+min(arr));
        }
        static int min(int[][] arr2d){
            int ans=arr2d[0][0];
            for(int[] arr1d : arr2d ){
                for(int elements : arr1d ){
                    if(elements<ans){
                        ans=elements;
                    }
                }
            }
            return ans;
        }
    }

