package Recursion;
//firstoccurance
public class occurance {
    public static int firstOccurance(int arr[],int key,int i) {
        if(i==arr.length){
            return-1;
        }
        if(key==arr[i]){
            return i;
        }
       return firstOccurance(arr,key,i+1);
    }
    public static int LastOccurance(int arr[],int key,int i) {
        if(i==arr.length){
            return -1;
        }
        int foundat=LastOccurance(arr, key, i+1);
        if(foundat==-1&&arr[i]==key){
            return i;
        }
        return foundat;
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurance(arr, 5, 0));
        System.out.println(LastOccurance(arr, 5, 0));
    }
}
