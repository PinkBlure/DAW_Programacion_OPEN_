import java.util.*;

/**
 * PRO_UT1_EA02_Padron_Torres_Aileen
 *
 * @author Aileen Padron Torres
 * @since 20-09-2023
 */
public class PRO_UT1_EA02_Padron_Torres_Aileen {

    public static void main(String[] args) {

        // Ejercicio 1

        // System.out.println("Actividad UT0_EA2 en Java");

        // Ejercicio 2

        /*
        String actividad = "Actividad UT0_EA2 en Java";
        System.out.println(actividad);
        */

        // Ejercicio 3

        /*
        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
         */

        // Ejercicio 4

        /*
        final float PI = 3.14F;
        int radius = 3;

        System.out.println("(" + PI + " * " + radius + "^^2) = " + (PI * radius * radius));
         */

        // Ejercicio 5

        /*
        float money = 13.95F;

        System.out.println("Descuento del 15% a " + money + " = " + (money - (money * 0.15)));
        */

        // Ejercicio 6

        /*
        Scanner entry = new Scanner(System.in);

        System.out.print("Dame tu anio de nacimiento: ");
        int birthDate = Integer.parseInt(entry.nextLine());
        int actualYear = 2023;

        System.out.println("Tienes " + (actualYear - birthDate) + " anios.");
         */

        // Ejercicio 7

        /*
        final int ACTUALYEAR = 2023;

        Scanner entry = new Scanner(System.in);

        System.out.print("Dame tu anio de nacimiento: ");
        int birthDate = Integer.parseInt(entry.nextLine());

        System.out.println("Tienes " + (ACTUALYEAR - birthDate) + " anios.");
         */

        // Ejercicio 8
        final int ACTUALYEAR = 2023;
        final String text = "Tu edad es: ";

        Scanner entry = new Scanner(System.in);

        System.out.print("Dame tu anio de nacimiento: ");
        int birthDate = Integer.parseInt(entry.nextLine());

        System.out.println(text + (ACTUALYEAR - birthDate));

    }
}