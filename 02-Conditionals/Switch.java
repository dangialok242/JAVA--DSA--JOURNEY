import java.util.*;
public class Switch {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Choose number:-");
        int number = scn.nextInt();

        switch(number){
            case 1 : System.out.println("Samosa");
                break;
            case 2 : System.out.println("Rasgulla");
                break;
            case 3 : System.out.println("Namkeen");
                break;
            case 4 : System.out.println("Mixture");
                break;
            case 5 : System.out.println("Biscute");            
        }
        scn.close();
    }
}

