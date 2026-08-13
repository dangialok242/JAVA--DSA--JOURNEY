import java.util.*;

public class AreaofCircle{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int r = scn.nextInt();
        
        double area =  3.14*r*r;
        System.out.println(area);

        scn.close();
    }
}