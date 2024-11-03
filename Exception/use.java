import java.util.*;
public class use {
    public static void main(String[] args) {
        Scanner sd= new Scanner(System.in);
        System.out.println("how many movie you want to rent ");
      int s = sd.nextInt();
      Too_many_movie ff = new Too_many_movie() ;
      try{
        
      ff.limite(s);
      }
      catch(Rental_limites e){
        System.out.println("Eception "+e);
      }
      sd.close();
    }
}
