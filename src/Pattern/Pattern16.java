package Pattern;
import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter how many rows you want to print : ");
        int n= sc.nextInt();
        for (int rows=n;rows>=1;rows--){
            for (int space=n;space>rows;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=rows;col++){
                if(col==1||col==rows){
                    System.out.print("* ");

                    }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        for (int rows=1;rows<=n;rows++){
            for (int space=n;space>rows;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=rows;col++){
                if(col==1||col==rows){
                    System.out.print("* ");

                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
