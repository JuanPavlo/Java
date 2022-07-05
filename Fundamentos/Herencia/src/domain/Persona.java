package domain;

public class Persona {

    // Protected sirve para que las clases hijas puedan acceder a los atributos de las clases padres
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    // Contructores:
    // 1. Vacio
    // 2. Inicializando el nombre
    // 3. Completo
    public Persona() {

    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    // GET Y SET
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setGenero(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre = " + this.nombre + ", genero = " + this.genero + ", edad = " + this.edad + ", direccion = " + this.direccion + "}";
    }

}
