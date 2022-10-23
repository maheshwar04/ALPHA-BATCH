package Functions;

public class Ex5 {
    public static boolean isPrim(int n){
        if(n==2){
            return true;
        }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
    public static void primes(int n){
        System.out.print("prime n.o :");
       for(int i=2;i<=n;i++){
         if(isPrim(i)){//true
         System.out.print(" "+i );
       }
    }
    }
    public static void main(String[] args) {
        primes(100);
    }
}
