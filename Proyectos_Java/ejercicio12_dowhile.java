
import java.util.Random;

public class ejercicio12_dowhile{
    public static void main(String []args){
        /*
        int i=1;
        do{
            System.out.println("i="+i);
            i++;
        }while(i<=10);
        
        int i=10;
        do{
            System.out.println("i="+i);
            i--;
        }while(i>=1);
        */
        Random rand=new Random();
        int aleatorio=rand.nextInt(5)+1;
        System.out.println("Aleatorio: "+aleatorio);
        int i=1;
        do{
            System.out.println("i="+i);
            i++;
        }while(i<=aleatorio);
    }
}
