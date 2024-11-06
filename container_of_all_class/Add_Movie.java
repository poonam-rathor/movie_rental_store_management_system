package movie_rental_store_management_system.container_of_all_class;
import java.util.*;
public class Add_Movie {
   
    static int s_no=1;
String Movie_name;
int date;
float money;
String genre;

Scanner sc = new Scanner(System.in);
 void add(){
System.out.println("Movie name ");
Movie_name= sc.next();

System.out.println("genre of movie ");
genre = sc.next();
System.out.println("cost of Movie ");
money = sc.nextFloat();
}
void show(){
    System.out.println("Serial "+s_no);
    System.out.println("Movie name-"+Movie_name);
    System.out.println("Genre of maovie- "+genre);
    System.out.println("Cost of maovie-"+money);
}

 
}
 

