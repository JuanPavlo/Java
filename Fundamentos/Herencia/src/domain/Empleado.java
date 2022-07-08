
package domain;


public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    public Empleado(String nombre, double sueldo) {
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public double getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override 
    public String toString() {
        return "Empleado{ " + "Nombre: " + this.nombre + ", Id Empleado: " + this.idEmpleado + ", Sueldo: " + this.sueldo + "} ";
    }
    
}
