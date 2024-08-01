package Basic;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse : ");
        int number = sc.nextInt();
//        reverse1(number);
//        int Ans=reverse(number);
//        System.out.println(Ans);
        reverseRecursion(number);
    }

    static void reverse1(int number) {
        while (number > 0) {
            int remainder = number % 10;
            System.out.print(remainder);
            number /= 10;
        }
    }


    static int reverse(int number) {
        int rev = 0;
        while (number > 0) {
            int remainder = number % 10;
            rev = rev * 10 + remainder;
            number /= 10;
        }
        return rev;
    }


    static void reverseRecursion(int number) {
        if (number < 10) {
            System.out.print(number);
        } else {
            System.out.print(number % 10);
            reverseRecursion(number / 10);
        }
    }

}



