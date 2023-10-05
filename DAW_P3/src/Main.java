import java.util.*;

public class Main {

    static Scanner insert = new Scanner(System.in);

    public static void main(String[] args) {

//        String nombre = "Pepito";
//        String apellido = "Pérez";
//        int anio_nacimiento = 10;
//        int edad;
//
//        if (anio_nacimiento <= 0) {
//            System.out.print("Dame tu anio de nacimiento: ");
//            anio_nacimiento = Integer.parseInt(insert.nextLine());
//        }
//
//        edad = 2023 - anio_nacimiento;
//
//        System.out.println("Tu edad es: " + edad);

        System.out.print("Dame tu calificacion: ");
        int calificacion = Integer.parseInt(insert.nextLine());

        if (calificacion == 10) System.out.println("Matrícula");
        else if (calificacion < 10 && calificacion >= 5) System.out.println("Aprobado");
        else System.out.println("Suspendido");
    }
}