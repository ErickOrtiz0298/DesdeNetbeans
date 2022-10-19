
package Calculadora;

public class PruebaCaja {
    public static void main(String[] args) {
        
        //Variables locales para pasar luego como argumentos de mi clase caja
        int an = 3; 
        int al = 2; 
        int pr = 6; 
        
        //creando el  objeto 
        Caja Caja1 = new Caja(an,al,pr); 
 
        //Accediendo al metodo para calcular el Volumen
        Caja1.calcularVolumen();
    }
}
