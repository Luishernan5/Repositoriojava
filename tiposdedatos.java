
public class tiposdedatos{
    public static void main(String []args){
        //8 bits -128 a 127
        byte mordida;
        mordida=126;
        System.out.println("Mordida: "+mordida);
        
        //16 bits -32768 a 32767
        short corto;
        corto=32000;
        System.out.println("Corto: "+corto);
        
        //32 bits -2147483648 a 2147483647
        int entero;
        entero=320000;
        System.out.println("Entero: "+entero);
        
        //64 bits -9.22337203685478E+018 a 9.22337203685478+018
        long largo;
        largo=3200000;
        System.out.println("Largo: "+largo);
        
        //32 bits -3.402823E+038 a 3.402823E+038
        float flotante;
        flotante=3200000.55f;
        System.out.println("Flotante: "+flotante);
        
        //64 bits -1.79769313486232E308 a 1.70769313486232E308
        double doble;
        doble=320000.55;
        System.out.println("Doble: "+doble);
        
        //16 bits 
        char caracter;
        caracter='c';
        System.out.println("Caracter: "+caracter);
        
        //1 bits
        boolean boleano;
        boleano=true;
        System.out.println("Verdadero: "+boleano);
        
    }
    
}