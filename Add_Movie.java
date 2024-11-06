
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
}
class View_Aavailable_movie(){
    void show(){
    System.out.println("Serial "+s_no);
    System.out.println("Movie name-"+Movie_name);
    System.out.println("Genre of maovie- "+genre);
    System.out.println("Cost of maovie-"+money);
}
}
 

 
class Use{

    public static void main(String[] args) {
        int a;
        System.out.println("----------------Enter your choise------------------- ");
        System.out.println("1.Add movie");
        System.out.println("2.Regester customer");
        System.out.println("3.Rent maovie");
        System.out.println("4.Return Movie");
        System.out.println("5.View Available movie");
        System.out.println("6.View Rented maovie");
        System.out.println("7.Search movie");
        System.out.println("Exit");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        switch (a) {
            
            case 1:
            Add_Movie sd= new Add_Movie();
               sd.add();
               
                break;
        
                case 2:
                break;

                case 3:
                break;

                case 4:
                break;

                case 5:
                View_Aavailable_movie sw = new View_Aavailable_movie();
                sw.show();
                
                break;

                case 7:
                break;

                case 8:
                break;

            default :
            System.out.println("you have enter wrong choise");
                break;
        }
    }

}