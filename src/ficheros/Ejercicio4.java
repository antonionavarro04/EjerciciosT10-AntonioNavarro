package ficheros;

import java.util.Locale;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Ejercicio4 {
    private static final String DIR = "out\\ejercicio4";
    private static final String ROUTE = "out\\ejercicio4\\Teclado.txt";

    public static void main(String[] args) {
        // ? Creamos el directorio si no existe
        File dir = new File(DIR);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // ? Creamos el fichero si no existe
        File file = new File(ROUTE);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.printf("Ha ocurrido un error al crear el archivo, ruta: \"%s\"\n", ROUTE);
            }
        }
        
        // ^ Definimos una instancia de Scanner para leer datos de teclado
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Definimos una String para almacenar los datos de teclado
        String cadena;

        // ^ Definimos un boolean para indicar que ha acabado
        boolean end = false;

        // ! Borramos el contenido del fichero
        try {
            FileWriter fw = new FileWriter(ROUTE);
            fw.write("");
            fw.close();
        } catch (IOException e) {
            System.err.printf("El archivo en la ruta \"%s\" no ha sido encontrado...\n", ROUTE);
        }

        while (!end) { // ? Leeremos datos de teclado hasta que el usuario introduzca la cadena "fin" en todas sus variantes
            // ! Pedimos al usuario que introduzca una cadena
            System.out.printf("Introduce una cadena de texto (\"fin\" para terminar): ");
            cadena = read.nextLine();

            // ? Si la cadena es vacía o es igual a "fin" en todas sus variantes, terminamos el bucle
            if (cadena.equalsIgnoreCase("fin")) {
                end = true;
            } else { // ? Si no, metemos la cadena en el fichero contenido en la variable global ROUTE
                try {
                    FileWriter fw = new FileWriter(ROUTE, true);
                    fw.write(cadena + "\n");
                    fw.close();
                } catch (IOException e) { // ? Si no se encuentra el fichero, mostramos un mensaje por pantalla
                    System.err.printf("El archivo en la ruta \"%s\" no ha sido encontrado...\n", ROUTE);
                } finally { // ? Si todo ha ido bien, mostramos un mensaje por pantalla
                    System.out.printf("La cadena \"%s\" ha sido escrita en el fichero \"%s\"\n", cadena, ROUTE);
                }
            } System.out.println(); // ? Salto de linea
        }

        // ^ Cerramos el Scanner
        read.close();
    }
}
