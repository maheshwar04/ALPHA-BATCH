package String;

public class letterUppercase {
    public static String toUppercase(String str){
        StringBuilder s=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        s.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()){
                s.append(str.charAt(i));
                i++;
                s.append(Character.toUpperCase(str.charAt(i)));
            }else{
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String str="hey; welcome to my github repository";
        System.out.println(toUppercase(str));
    }
}
