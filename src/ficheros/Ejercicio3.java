package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    private static final String ROUTE = "in\\ejercicio3\\Alumnos.ssv"; // ? Space Separated Values

    public static void main(String[] args) {
        // ^ Definimos una instancia de Scanner
        Scanner sc;

        // ^ Definimos un ArrayList de Strings en el que almacenaremos los nombres
        ArrayList<String> nombres = new ArrayList<String>();

        // ^ Definimos dos variables, totalEstaturas, totalEdades
        int edades = 0;
        float estaturas = 0;

        try {
            // ^ Definimos el Scanner como File Reader, cambiamos su formato a US para leer puntos en vez de comas en los floats
            sc = new Scanner(new FileReader(ROUTE)).useLocale(Locale.US);
            
            // ^ Definimos una String que leera las lineas
            String line;

            // ^ Definimos una variable que indica el final del Documento
            boolean end = false;

            // ? Mientras tenga una Linea y la ultima línea no este vacía vamos a leer los datos
            while (sc.hasNextLine() && !end) {
                // ! Leemos la primera Linea
                line = sc.nextLine();

                if (line.isEmpty()) { // ? Si la linea esta vacia
                    end = true; // ! Cambiamos el valor de end a true
                } else { // ? Si no esta vacia
                    String datos[] = line.split(" "); // ! Separamos la linea por Espacios y la guardamos en un array

                    nombres.add(datos[0]); // ! Agregamos el nombre al Array
                    edades += Integer.valueOf(datos[1]); // ! Agregamos las edades a la variable edades
                    estaturas += Float.valueOf(datos[2]); // ! Agregamos la estatura a la variable Estaturas
                }
            }
        } catch (FileNotFoundException e) {
            System.err.printf("El archivo en la ruta \"%s\" no ha sido encontrado...\n", ROUTE);
        } finally {
            System.out.printf("Nombres de los Alumnos: %s\nMedia de las edades: %.2f\nMedia de las estaturas: %.2f\n",
            nombres, (float) edades / nombres.size(), estaturas / nombres.size());
        }
    }
}
