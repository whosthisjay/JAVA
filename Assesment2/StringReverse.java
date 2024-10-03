package Assesment2;
//Write a java program to reverse a string?
public class StringReverse {
    public static void main(String[] args) {
        String original = "I am Batman from Tops";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
