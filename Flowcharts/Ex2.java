package Flowcharts;
import java.util.*;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter principle amount,interest rate and tenure");
        int P=sc.nextInt();
        int R=sc.nextInt();
        int T=sc.nextInt();
        int SI=(P*R*T)/100;
        System.out.println("Simple interest for "+T+" year is:"+SI);
        

    }
    
}
