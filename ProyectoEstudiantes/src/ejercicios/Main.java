package ejercicios;

public class Main {

    public static void main(String[] args) {

        EstudianteLicenciatura est1 =
                new EstudianteLicenciatura("Victor", 20, 85, "Ingeniería en Sistemas");

        EstudiantePosgrado est2 =
                new EstudiantePosgrado("Ana", 25, 90, "Inteligencia Artificial");

        System.out.println("=== Estudiante Licenciatura ===");
        est1.mostrarInformacion();
        System.out.println("Aprueba: " + est1.aprueba());

        System.out.println();

        System.out.println("=== Estudiante Posgrado ===");
        est2.mostrarInformacion();
        est2.investigar();
        System.out.println("Aprueba: " + est2.aprueba());
    }
}
