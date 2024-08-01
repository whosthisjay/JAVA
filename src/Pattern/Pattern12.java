package Pattern;
import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many rows you want to print : ");
        int n= sc.nextInt();
        for (int rows=1;rows<=n;rows++){
            for(int space=n;space>rows;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=(2*rows)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int rows=n-1;rows>=1;rows--){
            for(int space=n;space>rows;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=(2*rows)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
///optimized code
        for (int rows=1;rows<=n*2;rows++){
            int totalColInRow=rows>n?2*n-rows:rows;
            int noOfSpace=n-totalColInRow;
            for(int space=noOfSpace;space>=1;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=totalColInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int rows=1;rows<=n*2;rows++) {
            int totalColInRow = rows > n ? 2 * n - rows : rows;
            int noOfSpace = n - totalColInRow;
            for (int space = noOfSpace; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2 * totalColInRow) - 1; col++) {
                System.out.print("*");
            }


        }
        System.out.println();
        int[] a=new int[5];
        a[0]=1;
        a[1]=4;
        a[2]=3;
        System.out.println(a[1]);
        a[1]=9;
        for(int b:a){
            System.out.println(b);
        }
    Integer
    }
}
