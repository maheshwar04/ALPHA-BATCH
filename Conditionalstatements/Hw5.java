package Conditionalstatements;
import java.util.*;
public class Hw5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0||n%100==0&&n%400==0){
             System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
