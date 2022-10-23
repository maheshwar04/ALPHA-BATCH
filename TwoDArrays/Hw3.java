package TwoDArrays;

public class Hw3 {
    public static void Transpose(int matrix[][]){
        int[][] New=new int[matrix[0].length][matrix.length];
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 New[i][j]=matrix[j][i];
               System.out.print(New[i][j]+" ");
            }
            System.out.println();
         }
       
    }
    public static void main(String[] args) {
    int matrix[][]={{11,12,13},{21,22,23},{31,32,33}};
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
      System.out.print(matrix[i][j]+" ");
        }
    System.out.println();
    }
    System.out.println();
    Transpose(matrix);
}
}

