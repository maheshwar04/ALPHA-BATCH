package Variablesanddatatypes;
import java.util.*;
public class Hw3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost of a pencil a pen and a eraser");
        float a=sc.nextInt();
        float b=sc.nextInt();
        float c=sc.nextInt();
        float cost=(a+b+c);
        float totalcost=cost+(0.18f*(cost));
        System.out.println("the cost is "+cost);
        System.out.println("the total cost after gst is "+totalcost);
    }
}
