package Conditionalstatements;
import java.util.*;
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a _");
        System.out.print("operator _");
        System.out.print(" b : ");
        int a=sc.nextInt();
        char ch=sc.next().charAt(0);
        int b=sc.nextInt();
        switch(ch){
            case '+':System.out.println(a+b);
                     break;
            case '-':System.out.println(a-b);
                     break;
            case '*':System.out.println(a*b);
                     break;
            case '/':System.out.println(a/b);
                     break;
            default:System.out.println("wrong operator");
        }
    }
}
