package Recursion;


public class Ex2 {
    public static void printNum(int n){
        if(n==1){
          System.out.println(1);
          return;
        }
        printNum(n-1);
        System.out.println(n);
        
    }
      public static void main(String[] args) {
        printNum(10);
      }
}
