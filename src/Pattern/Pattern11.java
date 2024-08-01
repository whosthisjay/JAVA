package Pattern;
import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many rows you want to Print : ");
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int space=n;space>row;space--){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=n-1;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int space=n;space>row;space--){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
