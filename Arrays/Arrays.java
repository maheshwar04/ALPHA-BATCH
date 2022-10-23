package Arrays;
import java.util.*;
public class Arrays {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[5];
        System.out.println("Enter marks of all subjects");
        System.out.println("Array length "+marks.length);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();
        System.out.println("math "+marks[0]);
        System.out.println("phy "+marks[1]);
        System.out.println("che "+marks[2]);
        System.out.println("Eng "+marks[3]);
        System.out.println("Hin "+marks[4]);
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        marks[4]=marks[4]+1;
        System.out.println("Hin "+marks[4]);
    }
}
