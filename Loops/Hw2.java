package Loops;
import java.util.*;
public class Hw2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int number;
        char choice;
        int evensum=0;
        int oddsum=0;
        do{
            System.out.println("enter your number");
              number=sc.nextInt();
        if(number%2==0){
            evensum+=number;
        }else{
            oddsum+=number;
        }
        System.out.println("Do you want to continue y or n");
        choice=sc.next().charAt(0);
        }while(choice=='y');
         System.out.println("even sum "+evensum);
         System.out.println("odd sum "+oddsum);
}
}

