//Max subarray sum
package Arrays;
public class Sumsubarray {
    public static void maxsumSubarrays(int n[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){//time complexity=O(n^3)
                 currsum=0;
                for(int k=i;k<=j;k++){
                 System.out.print(n[k]+" ");
                   currsum=currsum+n[k];
                }
                System.out.print(" = "+currsum);
                if(maxsum<currsum) {
                    maxsum=currsum;
                }  
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("maxsubarraysum = "+maxsum);
       
    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,5,6};
        maxsumSubarrays(n);
    }
}