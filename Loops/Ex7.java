package Loops;
import java.util.*;
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        if(n==2){
          System.out.println("prime");
        }else{
        while(n>2){
           if(n%i==0){
            System.out.println("not prime");
            break;
           }else{
            System.out.println("prime");
            break;
        
           }
    }
}
}
}