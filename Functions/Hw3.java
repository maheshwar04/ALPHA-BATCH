package Functions;

public class Hw3 {
      public static int Reverse(int n){
         int rev=0;
         for(int i=n;i>0;i/=10){
          int lastdigit=i%10;
           rev=(rev*10)+lastdigit;
        }
   return rev;
      
        }
        public static void main(String[] args) {
            int n=123;
            System.out.println(n);

            System.out.println(Reverse(n));
            if(n==Reverse(n)){
               System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }
            }
        }
        

