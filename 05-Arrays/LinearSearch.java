import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[100];

        System.out.print("Enter number of element:");
        int n = scn.nextInt();

        System.out.print("Enter array element:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter element to search:");
        int key = scn.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element is found at position" + " "+(i + 1));
                return;
            }
        }
        System.out.println("Element is not found");
    }
}
