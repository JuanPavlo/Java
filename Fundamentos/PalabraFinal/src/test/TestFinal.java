
package test;
import domain.Persona;


public class TestFinal {
    public static void main(String[] args){ 
        final int constante = 10;
        System.out.println("Variable = " + constante);
        System.out.println("Mi constante = " + Persona.MI_CONSTANTE);
        final Persona persona1 = new Persona();
        persona1.setNombre("Juan Pablo");
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Luis Miguel");
        System.out.println("persona1 cambio = " + persona1.getNombre());
    }
}
