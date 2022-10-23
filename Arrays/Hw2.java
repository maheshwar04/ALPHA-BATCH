package Arrays;

public class Hw2 {
    public static int BinarySearch(int nums[],int x){
        int first=0;
        int last=nums.length-1;
      while(first<=last){
        int mid=(first+last)/2;
        if(nums[mid]==x){
              return mid;
        }
         if(nums[mid]<x){
               first=mid+1;
         }else{
            last=mid-1;
       }
    }
       return -1;
}
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int x=0;
        System.out.println(BinarySearch(nums,x));
    }
}
