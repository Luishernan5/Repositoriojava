
import java.util.Scanner;

public class Prototipo {
    int maxTam = 5;
    int frente, fin;
    String cola[];

    public Prototipo() {
        this.cola = new String[5];
        this.frente = 0;
        this.fin = maxTam - 1;
    }

    private int siguiente(int dato) {
        return (dato + 1) % maxTam;
    }

    public void insertar(String productos) {
        if (!llena()) {
            fin = siguiente(fin);
            cola[fin] = productos; //Se añaden por el final de la cola
        } else {
            System.out.println("Cola llena :´c");
        }
    }

    public void quitar() {
        if (!vacia()) {
            frente = siguiente(frente);
        } else {
            System.out.println("Cola vacía, inserte datos");
        }
    }

    public void borrarCola() {
        int i = frente;
        String datos = "";
        do {
            datos += "\nlaCircular [" + i + "] " + cola[i];
            i = siguiente(i);
        } while (i != siguiente(fin)); // Cambio aquí para evitar que el ciclo no termine correctamente
        System.out.println(datos);
    }

    private boolean vacia() {
        return frente == siguiente(fin);
    }

    private boolean llena() {
        return frente == siguiente(siguiente(fin));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear el objeto Scanner
        Prototipo cola = new Prototipo();

        // Solicitar al usuario que ingrese productos
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine(); // Leer el producto desde el teclado
            cola.insertar(producto);
        }

        // Mostrar la cola
        cola.borrarCola();

        // Quitar un producto de la cola
        cola.quitar();

        // Mostrar la cola nuevamente
        cola.borrarCola();

        scanner.close(); // Cerrar el objeto Scanner
    }
}