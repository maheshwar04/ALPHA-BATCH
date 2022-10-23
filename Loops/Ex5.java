package Loops;

public class Ex5 {
    public static void main(String[] args) {
        int n=30072002;
        for(int i=n;i>0;i/=10){
            int lastdigit=i%10;
             System.out.print(lastdigit);
        }
    }
}
