package Loops;

public class Ex6 {
    public static void main(String[] args) {
        int n=30072002;
        int rev=0;
        for(int i=n;i>0;i/=10){
         int lastdigit=i%10;
          rev=(rev*10)+lastdigit;
       }
     System.out.println(rev);
        
    }
}
