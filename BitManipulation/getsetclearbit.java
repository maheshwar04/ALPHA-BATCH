package BitManipulation;

public class getsetclearbit {
    public static int getBit(int n,int i){
        int bitmask=(1<<i);
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setBit(int n,int i){
        int bitmask=(1<<i);
            return n|bitmask;
    }
    public static int clearBit(int n,int i){
        int bitmask=~(1<<i);
            return n&bitmask;
    }
    public static int updateBit(int n,int i,int newbit){
        if(newbit==0){
           return clearBit(n,i);
        }else{
            return setBit(n,i);
        }
    }
    public static int clearIBit(int n,int i){
        int bitmask=((~0)<<i);
            return n&bitmask;
    }
    
    public static int clearIBitnRange(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
            return n&bitmask;
    }
    
    public static void main(String[] args) {
    //    System.out.println(getBit(10, 1)); 
    //    System.out.println(setBit(10, 2)); 
    //    System.out.println(clearBit(10, 1)); 
    //System.out.println(updateBit(10,1,0));
    // System.out.println(clearIBit(15, 2));
    System.out.println(clearIBitnRange(10, 2, 4));
    }
}
