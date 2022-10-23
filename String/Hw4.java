package String;
import java.util.*; 
public class Hw4 {
            
    public static void main(String[] args) {
        String str="race";
        String str1="care";
        // str=str.toLowerCase();
        // str1=str.toLowerCase();
        char[] ch1=str.toCharArray();
        char[] ch2=str1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(str.length()==str1.length()){
        boolean result=Arrays.equals(ch1,ch2);
        if(result){
           System.out.println("anagrams");
        }else{
            System.out.println("not anagrams");
        }
    }else{
        System.out.println("not anagrams");
    }
}
}