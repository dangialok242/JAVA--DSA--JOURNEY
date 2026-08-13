import java.util.*;
public class function {
    public static void printHelloworld(){
        for(int i = 1; i<=3; i++){
        System.out.println("Hello World");
        }
    }

    public static int calculatesum(int num1 ,int num2){ //Parameter or Formal Parameter
        int sum = num1 + num2;
        return sum ;
    }
    public static void main(String[] args){
        // printHelloworld();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int a = scn.nextInt();

        System.out.print("Enter 2nd Number:");
        int b = scn.nextInt();

        int sum = calculatesum(a, b);  // Argument or actual Parameter

        System.out.println("Sum :" + sum);

        scn.close();
    }
}
