package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
    private static final String OUT_DIR = "out\\ejercicio6";
    private static final String OUT_FILE = "ordenado.txt";
    private static final String OUT_ROUTE = OUT_DIR + "\\" + OUT_FILE;

    private static final String IN_DIR = "in\\ejercicio6";
    private static final String IN_FILE = "desordenado.txt";
    private static final String IN_ROUTE = IN_DIR + "\\" + IN_FILE;



    public static void main(String[] args) {
        // ? Creamos el directorio de salida y entrada si no existe
        File file = new File(OUT_DIR);
        if (!file.exists()) {
            System.out.printf("La ruta \"%s\" no existía y a sido creada\n", OUT_DIR);
            file.mkdirs();
        }

        file = new File(IN_DIR);
        if (!file.exists()) {
            System.out.printf("La ruta \"%s\" no existía y a sido creada\n", IN_DIR);
            file.mkdirs();
        }

        // ? Creamos el fichero de salida y entrada si no existe
        file = new File(OUT_ROUTE);
        if (!file.exists()) {
            try {
                System.out.printf("El fichero \"%s\" no existía y a sido creado\n", OUT_FILE);
                file.createNewFile();
            } catch (IOException e) {
                System.err.printf("Ha ocurrido un error al crear el archivo, ruta: \"%s\"\n", OUT_ROUTE);
            }
        }

        file = new File(IN_ROUTE);
        if (!file.exists()) {
            try {
                System.out.printf("El fichero \"%s\" no existía y a sido creado\n", IN_FILE);
                file.createNewFile();
            } catch (IOException e) {
                System.err.printf("Ha ocurrido un error al crear el archivo, ruta: \"%s\"\n", IN_ROUTE);
            }
        }
        
        // ^ Definimos un Scanner y un BufferedWriter a null
        Scanner sc = null;
        BufferedWriter bw = null;

        // ^ Definimos un ArrayList de Enteros
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // ! Leemos los datos del fichero
        try {
            sc = new Scanner(new BufferedReader(new FileReader(IN_ROUTE))).useLocale(Locale.US);

            while (sc.hasNextInt()) {
                numeros.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.err.printf("Ha ocurrido un error al leer el archivo, ruta: \"%s\"\n", IN_ROUTE);
        } finally {
            sc.close();
        }

        // ^ Ordenamos el Array
        numeros.sort(null);

        // ! Escribimos el array ordenado en el fichero
        try {
            bw = new BufferedWriter(new FileWriter(OUT_ROUTE, false));

            for (int i : numeros) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.printf("Ha ocurrido un error al escribir en el archivo, ruta: \"%s\"\n", OUT_ROUTE);
        } finally {
            try {
                bw.flush();
                bw.close();
            } catch (IOException e) {
                System.err.printf("Ha ocurrido un error al cerrar el archivo, ruta: \"%s\"\n", OUT_ROUTE);
            }
        }
    }
}
