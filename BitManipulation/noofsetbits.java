package BitManipulation;

public class noofsetbits {
    public static int noofSetbits(int n){
       int count =0;
       int mask=1;
      for(int i=0;i<32;i++){
       if((n&mask)!=0){
         count++;
       } 
       mask=mask<<1;
    }
       return count;       
    }
    public static void main(String[] args) {
        System.out.println(noofSetbits(10));
    }
}
