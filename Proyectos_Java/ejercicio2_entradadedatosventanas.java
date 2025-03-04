//importaciones:
import javax.swing.JOptionPane;

public class ejercicio2_entradadedatosventanas{
    public static void main(String []args){
        //ingreso de una cadena:
        String cadena= JOptionPane.showInputDialog("Ingresa una cadena: ");
        JOptionPane.showMessageDialog(null, "Esta es tu cadena: "+cadena);
        
        //ingreso de numero entero:
        int entero = Integer.parseInt(JOptionPane.showInputDialog("Dame un entero: "));
        JOptionPane.showMessageDialog(null, "Este es tu numero: "+entero);
        
        //ingreso numero flotante:
        float flotante= Float.parseFloat(JOptionPane.showInputDialog("Dame un numero flotante: "));
        JOptionPane.showMessageDialog(null, "Este es tu numero: "+flotante);
        
        //ingreso numero doble:
        double doble = Double.parseDouble(JOptionPane.showInputDialog("Dame un numero doble: "));
        JOptionPane.showMessageDialog(null, "Este es tu numero; "+doble);
        
        // Ingreso de caracteres:
        char caracter = JOptionPane.showInputDialog("Dame un caracter: ").charAt(2);
        JOptionPane.showMessageDialog(null, "Tu caracter es: "+caracter);
        
    }
}
