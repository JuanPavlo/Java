
package test;
import operaciones.Operaciones;


public class TestOperaciones {
    public static void main(String args[]) {
        var resultadoentero = Operaciones.sumar(5, 6);
        System.out.println("Resultado entero = " + resultadoentero);
        var resultadodecimal = Operaciones.sumar(5.6, 1.4);
        System.out.println("Resultado decimal = " + resultadodecimal);
    }
}
