package Variablesanddatatypes;
import java.util.*;
public class Ex6 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter radius of circle to find area");
    double r=sc.nextInt();
    double area=Math.PI*r*r;
    System.out.println("the area of circle is:"+area);
    }
}