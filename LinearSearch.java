import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        System.out.println("Enter the limit of array");
        Scanner scr = new Scanner(System.in);
        int limit = scr.nextInt();
        int[] array = new int[limit];

        for (int i = 0; i < limit; i++) {
            System.out.println("Enter " + i + " Element:");
            int element = scr.nextInt();
            array[i] = element;
        }

        System.out.println("Enter the element to search in the array:");
        int target = scr.nextInt();
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Index value of " + target + " is " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(target + " is not present in the array");
        }
    }
}
