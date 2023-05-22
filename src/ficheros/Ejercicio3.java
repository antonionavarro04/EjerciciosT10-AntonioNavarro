package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    private static final String ROUTE = "in\\ejercicio3\\Alumnos.txt";

    public static void main(String[] args) {
        Scanner sc;

        // ^ Definimos un ArrayList de Strings
        ArrayList<String> nombres = new ArrayList<String>();

        // ^ Definimos tres variables, totalEstaturas, totalEdades, i
        int edades = 0, i = 0;
        float estaturas = 0;

        try {
            sc = new Scanner(new FileReader(ROUTE));

            while (sc.hasNextLine()) {
                nombres.add(sc.nextLine());
                edades += sc.nextInt();
                estaturas += sc.nextFloat();
                i++;
            } sc.close();
        } catch (FileNotFoundException e) {
            System.err.printf("El archivo en la ruta \"%s\" no ha sido encontrado...\n", ROUTE);
        } finally {
            System.out.printf("%s:%s:%s:%s", edades, estaturas, i, nombres);
        }
    }
}
