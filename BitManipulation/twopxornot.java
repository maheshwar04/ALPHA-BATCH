package BitManipulation;

public class twopxornot {
    public static boolean twoPower(int n){
        return (n & (n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(twoPower(15));
    }
}
