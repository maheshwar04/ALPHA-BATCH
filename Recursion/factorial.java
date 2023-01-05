package Recursion;

public class factorial {
    public static int fact(int n){
        if(n==0){
          return 1;
        }
       int factnm1=fact(n-1);
       int factorial=n*factnm1;
       return factorial;
        
    }
      public static void main(String[] args) {
      System.out.println(fact(5));
      }
}


