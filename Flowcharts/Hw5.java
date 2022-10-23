package Flowcharts;

public class Hw5 {
    public static int Sum(int n){
        int sum=0;
        for(int i=n;i>0;i/=10){
            int lastdigit=i%10;
             sum=sum+lastdigit;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Sum(12345678));
    }
}
