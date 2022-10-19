
package Calculadora;

public class Caja {
    //atributos
    int ancho; 
    int alto; 
    int profundo; 
    
    //Constructor vacío 
    public Caja() {
        System.out.println("Constructor vacio");
    }
    
    //Constructor con 3 argumentos
    public Caja(int an, int al, int pr) {
        this.ancho = an; 
        this.alto = al; 
        this.profundo = pr; 
        System.out.println("Constructor con argumentos");
    }
    
    //Metodo calcularVolumen Recuerda que los metodos inician con minuscula y luego la siguiente palabra con mayuscula
    public void calcularVolumen () {
        int resultado = this.alto * this.alto * this.profundo; 
        System.out.println("resultado = " + resultado);
        
    }
}
