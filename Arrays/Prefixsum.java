//Max subarraysum using prefixsum
//prefix[end]-prefix[start-1]//prefixarray=sum of its first all array
package Arrays;

public class Prefixsum {
    public static void prefixSum(int n[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[n.length];
        prefix[0]=n[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+n[i];
        }
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){//time complexity=O(n^2)
                int end=j;
              currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxsum<currsum) {
                    maxsum=currsum;
                }  
            }
            }
            System.out.println("maxsubarraysum = "+maxsum);  
        }
      
       public static void main(String[] args) {
        int n[]={1,2,3,4,5,6};
        prefixSum(n);
    }
}

