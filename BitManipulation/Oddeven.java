package BitManipulation;
public class Oddeven {
    public static void oddEven(int n){
        if((n & 1) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        int n=5;
        oddEven(n);
    }
}
