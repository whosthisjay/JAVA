package Pattern;
import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter how many rows you want to print : ");
        int n= sc.nextInt();
        for(int rows=1;rows<=n;rows++){
            for(int space=n;space>=rows;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=(2*rows)-1;col++){
                if(col==1||col==rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int rows=n-1;rows>=1;rows--){
            for(int space=n;space>=rows;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=(2*rows)-1;col++){
                if(col==1||col==rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
