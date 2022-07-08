
package test;


public class TestArreglos {
    public static void main(String[] args) {
        int arreglo[] = new int[3]; // Se crea un arreglo de 3 posiciones
        System.out.println("arreglo = " + arreglo); // imprime la direccion del arreglo donde esta guardado

        //Modificando los elementos del arreglo
        arreglo[0] = 10;
//        System.out.println("arreglo[0] = " + arreglo[0]);
        arreglo[1] = 20;
//        System.out.println("arreglo[1] = " + arreglo[1]);
        arreglo[2] = 30;
//        System.out.println("arreglo[2] = " + arreglo[2]);
        
        for(int i=0; i<arreglo.length; i++) {
            System.out.println("Arreglo en la posicion " + i + " equivale a " + arreglo[i]);
        }
        
        String materiasUniversidad[] = {"Matematicas", "Logica", "Arquitectura", "Ingles", "Inteligencia Artificial"};
        for(int i=0; i < materiasUniversidad.length; i++) {
            System.out.println("Materia " + (i+1) + ": " + materiasUniversidad[i]);
        }
        System.out.println("materiasUniversidad = " + materiasUniversidad);
    }
}
