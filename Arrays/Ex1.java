package Arrays;

public class Ex1 {
    public static int Largest(int n[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
      for(int i=0;i<n.length;i++){
         if(largest<n[i]){
            largest=n[i];
         }
         if(smallest>n[i]){
            smallest=n[i];
         }
    }
    System.out.println("smallest "+smallest);
           return largest;
}
    public static void main(String[] args) {
        int n[]={5,6,7,9,8};
        int num=Largest(n);
        System.out.println("Largest "+num);
    }
}
