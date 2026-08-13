import java.util.*;
public class Areverse {
    // reverse fuction
    public static void reverse(int arr[]){
        int first = 0 ,last = arr.length -1;

        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;

        }
    }
    // array pairs 
    public static void printpairs(int arr[]){
        int tp =0;

        for(int i = 0; i < arr.length;i++){
            
            int curr = arr[i];
            for(int j = i+1; j< arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }

            System.out.println();
            
        }
        System.out.println( "Total number of Pairs"+ tp);
    }
    
        public static void main(String[] args){
            Scanner  scn = new Scanner (System.in);

            System.out.print("Enter size of array: ");
            int n = scn.nextInt();

            int[] arr = new int[n];

       
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        reverse(arr);

        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //.   **********************.    //

        
        printpairs(arr);


        scn.close();

        }
    }

