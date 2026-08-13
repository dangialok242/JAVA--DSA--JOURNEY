import java.util.*;
public class Gst {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.print("Item Price\n");

        System.out.print("Enter pen price: ");
        float pen = scn.nextFloat();

        System.out.print("Enter pencil price: ");
        float pencil = scn.nextFloat();

        System.out.print("Enter eraser price: ");
        float eraser = scn.nextFloat();

        float total = (pen+pencil+eraser);

        System.out.println("Total:" + total);

        float finalprice = total+(pen+pencil+eraser)*18/100;
        
        System.out.println("Finalprice with Gst:"+ finalprice);
        scn.close();

    }
}
