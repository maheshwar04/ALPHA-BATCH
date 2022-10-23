package Loops;
import java.util.*;
public class Ex2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number upto which you want to print");
    int n=sc.nextInt();
    int counter=1;
    while(counter<=n){
        System.out.print(counter+" ");
        counter++;
    }
}
}
