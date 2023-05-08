package ejercicios.ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos una instancia de la clase scanner
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Leemos dos int con nuestra nueva clase, uno forzando la excepción y otro no
        int nums[] = new int[2];
        for (int pos = 0; pos < nums.length; pos++) {
            System.out.printf("%s. >>> ", pos + 1);
            nums[pos] = Utils.readInt(read);
        }

        System.out.println(); // ? Salto de Línea

        // ? Imprimimos las variables
        for (int pos = 0; pos < nums.length; pos++) {
            System.out.printf("%s: %s\n", pos + 1, nums[pos]);
        }

        System.out.println("\n"); // ? Saltos de Línea

        // ! Leemos dos double de la misma manera, haremos uno con valor correcto y otro con uno incorrecto
        double doubles[] = new double[2];
        for (int pos = 0; pos < doubles.length; pos++) {
            System.out.printf("%s. >>> ", pos + 1);
            doubles[pos] = Utils.readDouble(read);
        }

        System.out.println(); // ? Salto de Línea

        // ? Imprimimos las variables
        for (int pos = 0; pos < doubles.length; pos++) {
            System.out.printf("%s: %s\n", pos + 1, doubles[pos]);
        }

        // ^ Cerramos el Scanner
        read.close();
    }
}
