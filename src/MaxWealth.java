public class MaxWealth {
//    1672.Leetcode
    public static void main(String[] args){
        int[][] accounts={{1,2,3},{3,2,1},{7,9,6,4}};
        System.out.print(maximumWealth(accounts));
    }
   static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int wealth : account) {
                sum += wealth;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
