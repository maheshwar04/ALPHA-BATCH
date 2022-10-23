package TwoDArrays;

public class Hw1 {
    public static void Count(int matrix[][],int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("number of "+key+" is/are "+count);
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},{8,8,7}};
        int key=7;
        Count(matrix, key);
    }    
}
