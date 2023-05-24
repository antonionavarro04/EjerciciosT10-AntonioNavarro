package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
    private static final String DIR = "out\\ejercicio4";
    private static final String ROUTE = DIR + "\\Teclado.txt";

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

        // ^ Definimos un BufferedWriter a null
        BufferedWriter bw = null;

        // ! Limpiamos el fichero
        try {
            bw = new BufferedWriter(new FileWriter(ROUTE));
            bw.write("");
        } catch (IOException e) {
            System.err.printf("Ha ocurrido un error al limpiar el archivo, ruta: \"%s\"\n", ROUTE);
        } finally {
            try {
                bw.flush();
                bw.close();
            } catch (IOException e) {
                System.err.printf("Ha ocurrido un error al cerrar el archivo, ruta: \"%s\"\n", ROUTE);
            }
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
                    bw = new BufferedWriter(new FileWriter(ROUTE, true));
                    bw.write(cadena);
                    bw.newLine();
                } catch (IOException e) { // ? Si no se encuentra el fichero, mostramos un mensaje por pantalla
                    System.err.printf("El archivo en la ruta \"%s\" no ha sido encontrado...\n", ROUTE);
                } finally { // ? Si todo ha ido bien, mostramos un mensaje por pantalla
                    try {
                        bw.flush();
                        bw.close();
                    } catch (IOException e) {
                        System.err.printf("Ha ocurrido un error al cerrar el archivo, ruta: \"%s\"\n", ROUTE);
                    }
                }
            } System.out.println(); // ? Salto de linea
        }

        // ^ Cerramos el Scanner
        read.close();
    }
}
