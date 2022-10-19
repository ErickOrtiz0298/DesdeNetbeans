package test;

import domain.Persona;

public class TestsArreglosObject {

    public static void main(String[] args) {
        Persona personas[] = new Persona[2];  //los arreglos se suelen definir en plural  Arreglo de objetos de tipo persona

        personas[0] = new Persona("Juan"); //nombre de la variable, el indice entre corchetes y luego el nuevo objeto con el string juan
        personas[1] = new Persona("Karla");

        System.out.println("personas = " + personas[0]); //con esto imprimimos la direccion del objeto NO SU CONTENIDO.Cuando declaramos el metodo toString podemos imrpimir el contenido del objeto SI QUITAS el toString del la clase Persona sale SOLO la dirección del objeto.
        System.out.println("personas = " + personas[1]); //con esto imprimimos la direccion del objeto NO SU CONTENIDO.Cuando declaramos el metodo toString podemos imrpimir el contenido del objeto SI QUITAS el toString del la clase Persona sale SOLO la dirección del objeto.

        for (int i = 0 ; i < personas.length; i++) {
            System.out.println("personas "+ i + " = "  + personas[i]);
        
        }
        
    }

}
