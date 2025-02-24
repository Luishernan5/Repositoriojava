
import java.util.Scanner;

public class ejercicio11_while{
    public static void main(String []args){
        try (/*
                int i=1;
                while(i<10){
                    System.out.println("i="+i);
                    i+=1;
                }
              
                int i=10;
                while(i>=1){
                    System.out.println("i="+i);
                    i-=1;
                }
                */
        Scanner entra = new Scanner(System.in)) {
            System.out.println("Cuantas veces quieres que se repita: ");
            int repeticiones=entra.nextInt();
            int i=1;
            while (i<=repeticiones){
                System.out.println("i="+i);
                i+=1;
            }
        }
    }
}