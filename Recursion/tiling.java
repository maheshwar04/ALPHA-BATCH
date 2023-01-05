package Recursion;

public class tiling {
    public static int tilingProblem(int n) {
        //corner case{
      if(n==0||n==1){
        return 1;
      }
      //horizontal case
      int hnm1=tilingProblem(n-1);
      //vertical case
      int hnm2=tilingProblem(n-2);
      int totalways=hnm1+hnm2;
      return totalways;
        }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
