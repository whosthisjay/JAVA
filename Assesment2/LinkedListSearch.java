package Assesment2;
import java.util.LinkedList;

//1) Given an element, how do you find out whether that element exist in a LinkedList or not.
// If it exist retrieve the position of that element?

public class LinkedListSearch {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int elementToFind = 30;

        int position = findElementPosition(list, elementToFind);

        if (position != -1) {
            System.out.println("Element " + elementToFind + " found at position: " + position);
        } else {
            System.out.println("Element " + elementToFind + " not found in the LinkedList.");
        }
    }

    public static int findElementPosition(LinkedList<Integer> list, int element) {
        int index = 0;

        for (Integer item : list) {
            if (item.equals(element)) {
                return index;
            }
            index++;
        }

        return -1;
    }
}
