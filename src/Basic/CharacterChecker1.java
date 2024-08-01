package Basic;
import java.util.Scanner;
public class CharacterChecker1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Press any key  : ");
        char ch=sc.next().charAt(0);
        if(Character.isLetter(ch)){
            System.out.print("This is Alphabet...");
        }
        else if(Character.isDigit(ch)){
            System.out.print("This is an Integer..");
        }else{
            System.out.println("This is Special Character...");
        }
    }
}
