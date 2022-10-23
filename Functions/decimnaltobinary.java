package Functions;

public class decimnaltobinary {
    public static void decToBin(int dec){
        int bin=0;
        int pow=0;
        for(int i=dec;i>0;i/=2){
            int rem=i%2;
            bin=bin + (rem*(int)Math.pow(10,pow));
            pow++;
        }
        System.out.println("Binary of "+dec+":"+bin);
    }
    public static void main(String[] args) {
        decToBin(15);
    }
}
