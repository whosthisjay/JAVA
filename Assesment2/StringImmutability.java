package Assesment2;
public class StringImmutability {
    public static void main(String[] args) {

        String originalString = "Hello, World!";
        System.out.println("Original String: " + originalString);
        String modifiedString = modifyString(originalString);

        System.out.println("Modified String: " + modifiedString);
        System.out.println("Original String after modification attempt: " + originalString); //Hence String Cant ne Mutatate
    }

    public static String modifyString(String str) {
        return str.replace("World", "Java");
    }
}
