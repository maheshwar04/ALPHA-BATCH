package Variablesanddatatypes;
import java.util.*;
public class Hw1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers you want to find average");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int average=(a+b+c)/3;
        System.out.println("the average of three numbers is "+average);
    }
}
