package Assesment2;
import java.util.Arrays;
//How To Check The Equality Of Two Arrays In Java?
public class ArraysEquals {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Are the arrays equal? " + areEqual);
    }
}
