package Recursion;

public class Pairing {
    public static int friendsPairing(int n) {
        if(n==1||n==2){
            return n;
        }
        //single
        int fnm1=friendsPairing(n-1);
        //pair
        int fnm2=friendsPairing(n-2);
        int total=fnm1+(n-1)*fnm2;
        return total;
    }
    public static void main(String[] args) {
       System.out.println( friendsPairing(3));
    }
}
