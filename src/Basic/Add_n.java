package Basic;

import java.util.Scanner;

public class Add_n {

        // main function
        public static void main(String[] args)
        {
            int N = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number to find sum of N Number : ");
            N = sc.nextInt();
//            addN(N);
           int answer= add_N(N);
           System.out.print(answer);

        }
        static void addN(int N){
            // we initialize the value of the variable i
            // with 1 and increment each time with 1
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += i;
            }

            System.out.println("Sum of first " + N
                    + " Natural Number = " + sum);
        }
        static int add_N(int N){
            int sum=0;
            sum=(N*(N+1))/2;
            return sum;
        }

}
