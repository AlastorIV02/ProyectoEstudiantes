package actividad;

public class Estudiante {
    public static void main(String[] args) {

        // Instanciación de objetos
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();

        // Uso de métodos
        estudiante1.mostrarInformacion();
        System.out.println("¿Aprueba? " + estudiante1.aprueba());

        System.out.println("------------------");

        estudiante2.mostrarInformacion();
        System.out.println("¿Aprueba? " + estudiante2.aprueba());
    }
}