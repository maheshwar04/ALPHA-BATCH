package Conditionalstatements;
import java.util.*;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income");
        int income=sc.nextInt();
        int tax;
        if(income<500000){
            tax=0;
            //System.out.println(tax);
        }else if(income>=500000&&income<=1000000){
            tax=(int)(income*0.2);//type casting
            //System.out.println(tax);

        }else{
            tax=(int)(income*0.3);//type casting
           // System.out.println(tax);
        }
        System.out.println("Your tax is "+tax);
    }
}
