package Conditionalstatements;
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1:samosa");
        System.out.println("2:Burger");
        System.out.println("3:mango shake");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch(choice){
            case 1:System.out.println("samosa");
            break;
            case 2:System.out.println("Burger");
            break;
            case 3:System.out.println("mango shake");
            break;
            default:System.out.println("dream");
        }
    }
}
