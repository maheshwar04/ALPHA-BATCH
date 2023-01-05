public class statickeyword {
    public static void main(String[] args) {
        student s1=new student();
        student.schoolName="ITER";
      s1.setName("Maheshwar");
      System.out.println(s1.getName()+" "+s1.schoolName);
      s1.percentage(80,90,100);
        student s2=new student();
      s2.setName("kunal");
      System.out.println(s2.getName()+" "+s2.schoolName);
      s2.percentage(80,90,90);
    }
}
class student{
      void percentage(int m,int c,int e){
         System.out.println((m+c+e)/3);
    }
    String name;
    int reg;
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
