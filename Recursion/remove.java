package Recursion;

public class remove {
    public static void removeDuplicateString(String str,int index,StringBuilder newStr,boolean map[]) {
            if(index==str.length()){
                System.out.println(newStr);
                return ;
            }
            char currchar=str.charAt(index);
            if(map[currchar-'a']==true){
                //duplicates
                removeDuplicateString(str, index+1, newStr, map);
            }else{
                map[currchar-'a']=true;
                removeDuplicateString(str, index+1,newStr.append(currchar), map);
            }
    }
    public static void main(String[] args) {
        String str="maheshwar";
        removeDuplicateString(str,0,new StringBuilder(" ") ,new boolean[26]);
    }
}
