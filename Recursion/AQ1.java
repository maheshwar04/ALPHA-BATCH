package Recursion;

public class AQ1 {
    public static void indecies(int arr[],int idx,int key) {
        if(idx==arr.length){
           return;
        }
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
            indecies(arr,idx+1, key);
        }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        indecies(arr, 0, 5);
    }
}
