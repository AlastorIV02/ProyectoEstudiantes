package ejercicios;

public class EstudianteLicenciatura extends Estudiante {

    private String carrera;

    public EstudianteLicenciatura(String nombre, int edad, double promedio, String carrera) {
        super(nombre, edad, promedio);
        this.carrera = carrera;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Carrera: " + carrera);
    }
}