import java.util.*;
public class fproduct {
    

        public static int multiply(int a ,int b){
            int product = a * b;
            return product;
        }
        public static void main(String[] args){

            Scanner scn = new Scanner(System.in);
            int a = 3;
            int b = 5;

            int prod = multiply(a,b);

            System.out.println(prod);

            scn.close();



    }
}
