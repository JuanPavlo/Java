
package test;
import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class TestHerencia {
    public static void main(String args[]) {
        Empleado empleado1 = new Empleado("Luis", 23.5);
        System.out.println(empleado1);
        Empleado empleado2 = new Empleado("Maria", 30.33);
        System.out.println(empleado2);
        Cliente cliente1 = new Cliente("David" , new Date(), true);
        System.out.println(cliente1);
    }
}
