package Basic;
import java.util.Scanner;
public class CharacterChecker2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Press any key  : ");
        char ch=sc.next().charAt(0);
        if(ch>='a'&& ch<='z'||ch>='A'&& ch<='Z'){
            System.out.print("This is Alphabet...");
        }
        else if(ch>='0' && ch<='9'){
            System.out.print("This is an Integer..");
        }else{
            System.out.println("This is Special Character...");
        }
    }
}
