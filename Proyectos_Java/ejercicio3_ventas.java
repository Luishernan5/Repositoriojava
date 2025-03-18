// importaciones:
import java.util.Scanner;

public class ejercicio3_ventas{
    public static void main(String []args){
        // Ingreso de datos:
        try (Scanner ventas = new Scanner(System.in)) {
            System.out.println("Ingresa el valor del producto 1: ");
            float prod1=ventas.nextFloat();
            System.out.println("Ingresa el valor del producto 2: ");
            float prod2=ventas.nextFloat();
            System.out.println("Ingresa el valor del producto 3: ");
            float prod3=ventas.nextFloat();
            float suma = prod1+prod2+prod3;
            System.out.println("El total de los productos es: "+suma);
            double totalredondeado=Math.ceil(suma);
            System.out.println("El total redondeado es: "+totalredondeado);
            double redondeo=totalredondeado-suma;
            System.out.println("Gracias por donar: "+redondeo);
        }    
    }
}
