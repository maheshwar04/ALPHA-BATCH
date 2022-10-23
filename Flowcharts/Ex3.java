package Flowcharts;
import java.util.*;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers you want find maximum of it");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("the largest number is "+a);
            }else{
                System.out.println("the largest number is"+c);
            }
        }else{
           if(b>c){
                System.out.println("the largest number is "+b);
            }else{
        System.out.println("the largest number is "+c);
    }
}
    }
}


