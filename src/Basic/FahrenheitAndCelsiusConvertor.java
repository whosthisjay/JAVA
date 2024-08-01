package Basic;
import java.util.Scanner;
public class FahrenheitAndCelsiusConvertor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float fahrenheit,celsius;
        System.out.println("Enter Type of Conversion ");
        System.out.println("1.Celsius To Fahrenheit \n 2.Fahrenheit To Celsius");
        int number =sc.nextInt();
        switch (number){
            case 1: System.out.println("Enter Temperature in Celsius :");
                celsius=sc.nextFloat();
                fahrenheit=(celsius*9/5)+32;
                System.out.println("Fahrenheit Temperature :"+fahrenheit);
                break;
            case 2: System.out.println("Enter Temperature in Fahrenheit : ");
            fahrenheit=sc.nextFloat();
            celsius=(fahrenheit-32)*5/9;
            System.out.println("Celsiius Temperature : "+celsius);
            break;
            default:System.out.println("Enter 1 or 2 to Execute Conversion Properly");
        }
    }
}
