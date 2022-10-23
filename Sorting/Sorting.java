package Sorting;
import java.util.Arrays;
import java.util.Collections;
public class Sorting {
    public static void Bubblesort(int a[]){
        for(int turn=0;turn<a.length-1;turn++){
            for(int j=0;j<a.length-1-turn;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        } 
    }
    public static void Selectionsort(int a[]){
        for(int turn=0;turn<a.length-1;turn++){
            int minpos=turn;
            for(int j=turn+1;j<a.length;j++){
                if(a[minpos]>a[j]){
                    minpos=j;
                }
            }
            int temp=a[minpos];
            a[minpos]=a[turn];
            a[turn]=temp;


        } 
    }
    public static void insertionSort(int a[]){
         for(int i=1;i<a.length;i++){
            int curr=a[i];
            int prev=i-1;
            //finding out the current position to insert
            while(prev>=0 && a[prev]>curr){
                 a[prev+1]=a[prev];
                 prev--;
            }
            //insretion
            a[prev+1]=curr;
         }
    }
    public static void countingSort(int a[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
              largest=Math.max(largest,a[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }   
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
               count [i]--; 
            }
        }                   
    }

    public static void main(String[] args) {
        int a[]={1,4,1,3,2,4,3,7};
       // Bubblesort(a);
       // Selectionsort(a);
       //insertionSort(a);
      // Arrays.sort(a);
      //Arrays.sort(a,0,5);
      //Arrays.sort(a,Collections.reverseOrder());
      countingSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
