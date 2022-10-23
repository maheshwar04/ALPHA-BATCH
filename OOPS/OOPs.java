package OOPS;

public class OOPs {
    public static void main(String[] args) {
        fish shark=new fish();
         shark.eats();
    }
}
//Inheritance
class Animal{
     String type;
     void eats(){
        System.out.println("eats");
     }
     void colors(){
       System.out.println("blue");

     }
    }
    class fish extends Animal{
          int fins;
          void swim(){
            System.out.println("swim");
          }
    }

