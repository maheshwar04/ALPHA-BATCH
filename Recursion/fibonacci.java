package Recursion;

public class fibonacci {
    public static void fibo(int n ,int a,int b) {
        if(n==0){
            return;
        }

    //     int fnm1=fibo(n-1);
    //     int fnm2=fibo(n-2);
    //     int fn=fnm1+fnm2;
    //     return fn;
    int c=a+b;
    System.out.println(c);
    fibo(n-1,b,c);
    }

    public static void main(String[] args) {
       // System.out.println(fibo(9));
       int a=0;
       int b=1;
       int n=5;
       System.out.println(a);
       System.out.println(b);
       fibo(n-2,a,b);

    }
}
