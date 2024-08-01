package Pattern;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter How Many rows You Want to Print :");
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=n;space>row;space--){
                System.out.print(" ");
            }
            for(int coloumn=row;coloumn>1;coloumn--){
                System.out.print(row);
            }
            for(int coloumn=1;coloumn<=row;coloumn++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
