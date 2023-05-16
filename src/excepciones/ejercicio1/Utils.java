package excepciones.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static int readInt(Scanner s) {
        int n;
        try { // ? Intentamos leer un número entero
            n = s.nextInt();
        } catch (InputMismatchException e) { // ? En caso que no se introduzca lo deseado captamos la excepción
            System.err.println("El valor introducido no es de tipo Integer"); // ! Imprimimos un mensaje de error
            n = 0; // ! Ponemos 'n' a 0
        } s.nextLine();
        return n;
    }

    public static double readDouble(Scanner s) {
        double d;
        try { // ? Intentamos leer un número entero
            d = s.nextDouble();
        } catch (InputMismatchException e) { // ? En caso que no se introduzca lo deseado captamos la excepción
            System.err.println("El valor introducido no es de tipo Double"); // ! Imprimimos un mensaje de error
            d = 0.0d; // ! Ponemos 'n' a 0
        } s.nextLine();
        return d;
    }
}
