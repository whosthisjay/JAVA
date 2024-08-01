package Pattern;
import java.util.Scanner;
public class Pattern10
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many rows you want ot print : ");
        int n=sc.nextInt();
        for(int rows=n;rows>=1;rows--){
            for(int space=n;space>rows;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=(2*rows)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }

}
}
