public class inter{
    public static void main(String[] args) {
        // queen q1=new queen();
        // q1.moves();
        omnivore o=new omnivore();
        o.eats();
    }
}
interface herbivore{
     void eats();
    }
interface carnivore{
    void eats();
    }
class omnivore implements herbivore,carnivore{
    public void eats(){
        System.out.println("eats both");
    }
}
// interface chessPlayer{
//     void moves();
// }
// class king implements chessPlayer{
//      public void moves(){
//         System.out.println("move left rightt up doen and diagonal by one step");
//      }
// }
// class queen implements chessPlayer{
//      public void moves(){
//         System.out.println("move left rightt up doen and diagonal");
//      }
// }