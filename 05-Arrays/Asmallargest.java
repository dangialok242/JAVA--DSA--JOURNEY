import java.util.*;

    public class Asmallargest{
        public static int getLargest(int numbers[]){
            int largest = Integer.MIN_VALUE;
            
            for(int i = 0; i < numbers.length; i++){
                if (largest < numbers[i]){
                    largest = numbers[i];
                }
            }
            return largest;
        }
        public static int getSmallest(int numbers[]){
            int smallest = Integer.MAX_VALUE;
            
            for(int i = 0; i < numbers.length; i++){
                if (smallest > numbers[i]){
                    smallest = numbers[i];
                }
            }
            return smallest;
        }
        
        public static void main(String [] args){
            Scanner scn = new Scanner (System.in);

            int numbers[] = new int[10];
            System.out.print("Enter array value :");

            for (int i = 0; i < 10; i++) {
            numbers[i] = scn.nextInt();
            }
            System.out.println("largest Number is : " + getLargest(numbers));
            System.out.println("Smallest Number is : " + getSmallest(numbers));

            scn.close();
        }
    }