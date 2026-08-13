import java.util.*;
public class week {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Week number:");
        int days = scn.nextInt();

        switch (days) {
            case 1:
                System.out.println("Monday");
                    break;
            case 2:
                System.out.println("Tuesday");
                    break;
            case 3:
                System.out.println("Wednesday");
                    break;
            case 4:
                System.out.println("Thrusday");
                    break;
            case 5:
                System.out.println("Friday");
                    break;
            case 6:
                System.out.println("Saturday");
                    break;
            case 7:
                System.out.println("Sunday");
                    break;
            default:
                System.out.println("Wrong entry");
                    break;
        }
        scn.close();
    }
}
