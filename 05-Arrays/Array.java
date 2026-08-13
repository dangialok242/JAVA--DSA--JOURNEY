import java.util.*;
public class Array {
    public static void main(String[] args){

        int marks[] = new int[100];

        Scanner scn = new Scanner(System.in);

        marks[0] = scn.nextInt();
        marks[1] = scn.nextInt();
        marks[2] = scn.nextInt();

        System.out.println("Pysics:" + marks[0]);
        System.out.println("Chemistry:" + marks[1]);
        System.out.println("Mathematics:" + marks[2]);

        scn.close();
    }
}
