import java.util.*;
public class typecasting {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);

        // float a = 10.24f;
        // int b = (int)a;    // by force we change flaot value to int value. by using datatype jis mai hume change karna hai.

        int a = 10;
        float b = a; // here no any problem because type conversion rule is valid int--->float.so we simply print easily.
        System.out.println(b);

        scn.close();
    }
}
