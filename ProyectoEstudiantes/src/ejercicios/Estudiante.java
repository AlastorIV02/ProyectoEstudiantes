package ejercicios;

public class Estudiante {
	
	protected String nombre;
    protected int edad;
    protected double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }

    public boolean aprueba() {
        return promedio >= 70;
    }

}
