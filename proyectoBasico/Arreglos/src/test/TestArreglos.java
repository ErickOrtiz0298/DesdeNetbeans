
package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades [] = new int[3];//arreglos en java con corchetes, los arreglos son un tipo object new int[3] ---> 3 elementos
        //En java los arreglos no pueden crecer
        System.out.println("edades = " + edades);
        
        //modificando los elementos del arreglo
        edades[0] = 10;//modificando el valor del primer elemento
        System.out.println("edades 0 = " + edades[0]);
        
        edades[1] = 20;//modificando el valor del segundo elemento
        System.out.println("edades 1 = " + edades[1]);
        
        edades[2] = 30;//modificando el valor del tercer elemento
        System.out.println("edades 2 = " + edades[2]);
        
        
        //Intentando accede al cuarto elemento del arreglo
        //edades[3] = 5; //sale un error en tiempo de ejecucion. "Index 3 out of bounds for length 3"
        
        //Iterando cada uno de los elementos 0,1,2
        
        for(int i = 0; i < edades.length; i++) {
            
            //edades es un objeto por lo tanto igual tiene propiedades como el lenght
            System.out.println("edades elemento " + i + ": " + edades[i]);
        } 
        
        //arreglo con elementos inicializados llamado "sintaxis resumida"
        String frutas[] = {"Naranja", "Platano", "Uva"} ;
        //for + tab
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
            
        }
        
    }
    
}
