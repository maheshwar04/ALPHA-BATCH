|package BackTracking;

public class gridWays {
  public static int Way(int arr[][],int row ,int column){

     if(row==arr.length-1&&column==arr[0].length-1){
      return 1;
     }
     if(row>=arr.length||column>=arr[0].length){
      return 0;
     }
    // right
    int right=Way(arr, row, column+1);
    //down
    int down =Way(arr,row+1,column);
    return right+down;
  }
  public static void main(String[] args) {
    int arr[][]=new int[3][3];
    System.out.println(Way(arr, 0, 0));
  }
}
