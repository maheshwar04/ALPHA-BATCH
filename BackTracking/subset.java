package BackTracking;
public class subset {
    private static void subsetFun(String str,StringBuilder s,int i) {
        //Recursion
        if(i==str.length()){
            if(s.isEmpty()){
                System.out.println("Null");
            }else {
                System.out.println(s);
                s.deleteCharAt(s.length() - 1);
            }
            return;
        }
        //yes
        subsetFun(str,s.append(str.charAt(i)),i+1);
        //no

        subsetFun(str,s,i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        subsetFun(str,new StringBuilder(""),0);
    }
}
