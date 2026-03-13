package ejercicios;

public class EstudiantePosgrado extends Estudiante {

    private String especialidad;

    public EstudiantePosgrado(String nombre, int edad, double promedio, String especialidad) {
        super(nombre, edad, promedio);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
    }

    public void investigar() {
        System.out.println(nombre + " está investigando en " + especialidad);
    }
}