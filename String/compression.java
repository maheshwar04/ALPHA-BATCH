package String;
public class compression {
    public static String Compression(String str){
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=0;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            s.append(str.charAt(i));
            if(count>1){
                s.append(count+1);
            }
        }
        return s.toString();
        
    }
    public static void main(String[] args) {
        String str="aaabbbcc";
        System.out.println(Compression(str));
    }
}
