//importaciones
import java.util.Scanner;

public class ejercicio1_entradadedatosterminal{
    
    public static void main(String [] args){
        try (//valor entero:
        Scanner entrada = new Scanner(System.in)) {
            int valor;
            System.out.println("Escribe un numero: ");
            valor=entrada.nextInt();
            System.out.println("Tu numero es: "+valor);
        }
        try (//valor flotante:
        Scanner entrada1 = new Scanner(System.in)) {
            float valor1;
            System.out.println("Escribe otro numero: ");
            valor1= entrada1.nextFloat();
            System.out.println("Tu numero es: "+valor1);
        }
        try (//valor doble
        Scanner entrada2 = new Scanner(System.in)) {
            double valor2;
            System.out.println("Dame otro numero: ");
            valor2 = entrada2.nextDouble();
            System.out.println("Tu numero es: "+valor2);
        }
        try (//cadena 
        Scanner entrada3 = new Scanner(System.in)) {
            String cadena;
            System.out.println("Escribe una cadena: ");
            cadena=entrada3.nextLine();//nextline para que rspete los espacios
            System.out.println("Tu cadena es: "+cadena);
        }
        try (//caracter
        Scanner entrada4 = new Scanner(System.in)) {
            char caracter;
            System.out.println("Escribe un caracter: ");
            caracter= entrada4.next().charAt(0);
            System.out.println("Tu caracter es: "+caracter);
        }
        
        
                
    }
    
}
