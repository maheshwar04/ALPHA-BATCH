package Conditionalstatements;
import java.util.*;
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your marks");
        int n=sc.nextInt();
        String result=(n>=33)?"pass":"fail";
        System.out.println(result);
    }
}
