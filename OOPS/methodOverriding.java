package OOPS;

public class methodOverriding {
    public static void main(String[] args) {
        deer d1=new deer();
        d1.eat();

    }
}
class Animal{
    void eat(){
        System.out.println("eat Something");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}

