package ejercicios;

public class Main {

	public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Victor", 20, 85);
        Estudiante estudiante2 = new Estudiante("Ana", 19, 60);

        estudiante1.mostrarInformacion();
        System.out.println("¿Aprueba? " + estudiante1.aprueba());

        System.out.println("------------------");

        estudiante2.mostrarInformacion();
        System.out.println("¿Aprueba? " + estudiante2.aprueba());

	}

}
