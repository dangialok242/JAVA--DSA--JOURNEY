import java.util.*;
public class ABinarySearch {

    public static int BinarySearch(int[] numbers, int key){
        int Start = 0 , end = numbers.length - 1;

        while(Start <= end){

            int mid = (Start + end )/2;
            if (numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key){
                Start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int numbers[] = new int[10];

        System.out.print("Enter Array Number:");

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scn.nextInt();
        }

        System.out.print("Enter search number: ");
        int key = scn.nextInt();

        System.out.println("Search number index : " + BinarySearch(numbers, key));
        scn.close();
    }
}
