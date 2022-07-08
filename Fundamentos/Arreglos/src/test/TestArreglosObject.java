
package test;
import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2]; // Se crea el arreglo de objetos
        personas[0] = new Persona("Juan"); // Se crea un objeto
        personas[1] = new Persona("Carlos"); // Se crea un objeto
        for(int i=0; i<personas.length; i++) {
            System.out.println("Persona " + i + " se llama: " + personas[i].getNombre());
        }
        System.out.println(personas[0].toString());
        System.out.println(personas[1].toString());
    }
}
