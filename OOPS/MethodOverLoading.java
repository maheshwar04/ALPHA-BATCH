package OOPS;
public class MethodOverLoading {
    public static void main(String[] args) {
        calculator calc=new calculator();
        System.out.println(calc.sum(1,4));
        System.out.println(calc.sum((float)1.5,(float)4.5));
        System.out.println(calc.sum(1,4,5));
    }
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}