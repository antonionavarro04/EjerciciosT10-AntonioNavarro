package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio2 {
    private static final String ROUTE = "in\\ejercicio2\\Enteros.txt";
    public static void main(String[] args) {
        // ^ Definimos un Scanner
        Scanner sc;

        // ^ Definimos una variable para la suma y otra para la media
        int suma = 0, i = 0;

        // ! Leemos el fichero
        try {
            sc = new Scanner(new FileReader(ROUTE));

            while (sc.hasNextInt()) {
                suma += sc.nextInt();
                i++;
            } sc.close();
        } catch (FileNotFoundException e) {
            System.err.printf("El archivo en la ruta \"%s\" no ha sido encontrado...\n", ROUTE);
        } finally {
            System.out.printf("La suma de todos los nuemros Enteros es: %d\nLa media aritmética de todos los números Enteros es: %.2f", suma, (float) suma / i);
        }
    }
}
