package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {
    private static final String DIR = "out\\ejercicio5";
    private static final String FILE = "datos.txt";
    private static final String ROUTE = DIR + "\\" + FILE;

    public static void main(String[] args) {
        // ? Creamos el directorio si no existe
        File dir = new File(DIR);
        if (!dir.exists()) {
            System.out.printf("La ruta \"%s\" no existía y a sido creada\n", DIR);
            dir.mkdirs();
        }

        // ? Creamos el fichero si no existe
        File file = new File(ROUTE);
        if (!file.exists()) {
            try {
                System.out.printf("El fichero \"datos.txt\" no existía y a sido creado\n", FILE);
                file.createNewFile();
            } catch (IOException e) {
                System.err.printf("Ha ocurrido un error al crear el archivo, ruta: \"%s\"\n", ROUTE);
            }
        }

        // ^ Definimos un Scanner para leer datos por Teclado
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Definimos un Array de Strings de 2 posiciones
        String datos[] = new String[2];

        // ! Pedimos los datos al usuario y los guardamos en el Array
        System.out.print("Introduce tu nombre: ");
        datos[0] = read.nextLine();

        System.out.print("Introduce tu edad: ");
        datos[1] = String.valueOf(read.nextInt()); read.nextLine();

        // ^ Cerramos el Scanner
        read.close();

        try {
            // ^ Creamos el BufferedWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

            // ^ Escribimos la información
            for (int pos = 0; pos < datos.length; pos++) {
                bw.write(datos[pos]);

                if (pos != datos.length - 1) {
                    bw.write(" ");
                }
            } bw.newLine(); // ? Agregamos un salto de línea
            bw.flush(); // ? Forzamos la escritura de los datos
            bw.close(); // ^ Cerramos el BufferedWriter
        } catch (IOException e) {
            System.err.printf("Ha ocurrido un error en el fichero de ruta \"%s\"\n", ROUTE);
        } finally {
            System.out.printf("La información ha sido escrita en el fichero ha sido escrito correctamente\n");
        }
    }
}
