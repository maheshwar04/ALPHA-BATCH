package Recursion;

public class AQ2 {
    static String eng[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void print(int n) {
        if(n==0){
            return;
        }
        int lastdigit=n%10;
        print(n/10);
        System.out.print(eng[lastdigit]+" ");
    }
    public static void main(String[] args) {
        print(1234);
    }
}
