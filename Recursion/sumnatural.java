package Recursion;

public class sumnatural {
    public static int natSum(int n){
        if(n==1){
          return 1;
        }
       int sumnm1=natSum(n-1);
       int sum=n+sumnm1;
       return sum;
        
    }
      public static void main(String[] args) {
      System.out.println(natSum(5));
      }
}
