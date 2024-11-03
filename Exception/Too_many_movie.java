
public class Too_many_movie {
 void limite(int a)throws Rental_limites{

       
        if(a<=5){
            System.out.println("you have rented movie "+a);
           
        }
    else{
        Rental_limites sf = new Rental_limites("you have reached the limite you can only rent 5 movies at a time no more");    
        throw sf;
    } 
        
    }
    }
   

