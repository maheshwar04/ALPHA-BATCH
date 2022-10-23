package String;

public class Hw1 {
    public static Integer Count(String str){
        StringBuilder s=new StringBuilder("");
        Integer count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="Maheshwar";
        System.out.println(Count(str));
    }
}
