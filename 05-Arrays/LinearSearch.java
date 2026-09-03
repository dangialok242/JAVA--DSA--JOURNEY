import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scn.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = scn.nextInt();


        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                scn.close();
                return;
            }
        }

        System.out.println("Element not found");
        scn.close();
        
    }
}