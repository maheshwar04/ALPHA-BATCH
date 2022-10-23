package Loops;
import java.util.*;
public class Hw4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n.o whose table you want");
    int n=sc.nextInt();
    for(int i=1;i<=10;i++){
        int mult=n*i;
        System.out.println(n+" * "+i+" = "+mult);
    }
}
}
