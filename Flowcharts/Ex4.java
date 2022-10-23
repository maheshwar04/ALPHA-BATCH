package Flowcharts;
import java.util.*;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number upto which you want to add natural number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("the sum of first natural number is "+sum);
        
    }
}
