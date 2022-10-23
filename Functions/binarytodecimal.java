package Functions;

public class binarytodecimal {
    public static void bintodec(int binr){
        int pow=0;
        int dec=0;
        for(int i=binr;i>0;i/=10){
            int lastdigit=i%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
        }
        System.out.println("decimal of "+binr+" : "+dec);
    }
    public static void main(String[] args) {
        bintodec(1000);
    }
}
