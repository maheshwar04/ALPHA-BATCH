package Recursion;

public class pn {
        public static int pow(int x,int n) {
            if(n==0){
                return 1;
            }
            int pnm1=pow(x,n-1);
            int pown=x*pnm1;
            return pown;
        }
        public static int optmizedpow(int x,int n) {
            if(n==0){
                return 1;
            }
            int pnb2=pow(x,n/2);
            int pown=pnb2*pnb2;
            if((n%2)!=0){
                return x*pown;
            }
            return pown;
        }
        public static void main(String[] args) {
            System.out.println(pow(2, 10));
            System.out.println(optmizedpow(2, 5));
        }
    }

