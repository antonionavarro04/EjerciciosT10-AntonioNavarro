package ficheros.ejercicio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

// ^ Para este caso lo suyo es usar un TreeMap<String, TreeSet>, de esta forma los datos se ordenan automáticamente por su fecha
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    private static final String DIR = "mixed\\ejercicio8";
    private static final String FILE = "Temperaturas.csv";
    private static final String ROUTE = DIR + "\\" + FILE;

    protected static final char SALIR = '3';

    // ^ Definimos un TreeMap para guardar los datos
    protected static TreeMap<String, TreeSet<Float>> registros = new TreeMap<String, TreeSet<Float>>();

    public static void main(String[] args) {
        // ^ Definimos un Scanner para datos y otro para leer ficheros
        Scanner sc = null, read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Definimos un BufferedWriter a null
        BufferedWriter bw = null;

        // ? Creamos el directorio si no existe
        File file = new File(DIR);
        if (!file.exists()) {
            System.out.printf("Se ha creado el directorio \"%s\"\n", DIR);
            file.mkdirs();
        }

        // ? Creamos el fichero si no existe
        file = new File(ROUTE);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.printf("Se ha creado el fichero \"%s\"\n", ROUTE);
            } catch (IOException e) {
                System.err.printf("Ha ocurrido un error al crear el archivo, ruta: \"%s\"\n", ROUTE);
            }
        }

        // ! Leemos el fichero y guardamos los datos en el TreeMap
        try { // ? Estructura del Fichero -> "Fecha, TemperaturaMaxima, TemperaturaMinima"
            sc = new Scanner(new BufferedReader(new FileReader(ROUTE)));
            sc.useLocale(Locale.US);
            if (sc.hasNextLine()) {
                sc.nextLine(); // ! Saltamos la cabecera del csv
            }

            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split(",");

                String fecha = data[0];

                TreeSet<Float> list = new TreeSet<Float>();
                list.add(Float.parseFloat(data[1]));
                list.add(Float.parseFloat(data[2]));

                registros.put(fecha, list);
            }
        } catch (FileNotFoundException e) {
            System.err.printf("Ha ocurrido un error al leer el archivo, ruta: \"%s\"\n", ROUTE);
        } finally {
            sc.close();
        }

        /* ! CRUD ! */

        // ^ Definimos una variable char y string
        char option = '0';
        String cadena = "";

        // ! Una vez cargado los datos en la Agenda procedemos al CRUD
        do {
            System.out.print(Methods.menu());
            System.out.println(registros);
            try {
                option = read.nextLine().charAt(0);
            } catch (StringIndexOutOfBoundsException e) {
                System.err.printf("Se ha intoducido una cadena no válida\n");
                option = '0';
            } finally {
                System.out.println(); // ? Salto de línea
            } switch (option) {
                case '1':
                    boolean state = true, state2 = true;

                    // ^ Definimos un array de Floats
                    TreeSet<Float> temperaturas = new TreeSet<Float>();
                    do {
                        // ^ Definimos numeros para comprobar más cómodamente
                        int n;

                        // ^ Conseguimos el año actual
                        Calendar calendar = Calendar.getInstance();
                        int year = calendar.get(Calendar.YEAR);

                        if (!state) {
                            System.err.printf("La fecha \"%s\" ya existe.\nIntroduce otra fecha\n\n", cadena);
                        }

                        do { // ? Comprobamos que el año sea menor o igual al actual
                            System.out.print("Introuduce el año: ");
                            n = read.nextInt(); read.nextLine();
                        } while (n > year);
                        cadena = String.valueOf(n);

                        while (cadena.length() < 4) { // ? Añadimos 0 hasta que la cadena tenga 4 caracteres
                            cadena = "0" + cadena;
                        } cadena += "-";

                        do { // ? Comprobamos que el mes sea menor o igual a 12 y mayor que 0
                            if (!state2) {
                                System.err.printf("El mes \"%d\" no existe.\nIntroduce otro mes\n\n", n);
                            } System.out.print("Introuduce el mes: ");
                            n = read.nextInt(); read.nextLine();
                            state2 = false;
                        } while (n > 12 || n < 1);
                        state2 = true;

                        if (n % 10 == 0) { // ? Si solo tiene una cifra
                            cadena += "0";
                        } cadena += String.valueOf(n) + "-";

                        do { // ? Comprobamos que el día sea menor o igual a 31 y mayor que 0
                            if (!state2) {
                                System.err.printf("El día \"%d\" no existe.\nIntroduce otro día\n\n", n);
                            } System.out.print("Introuduce el día: ");
                            n = read.nextInt(); read.nextLine();
                            state2 = false;
                        } while (n > 31 || n < 1);
                        if (n % 10 == 0) { // ? Si solo tiene una cifra
                            cadena += "0";
                        } cadena += String.valueOf(n);
                        
                        if (state) { // ? Si es la primera vez cogemos las temperaturas
                            System.out.print("Introduce la Temperatura Máxima: ");
                            temperaturas.add(read.nextFloat()); read.nextLine();
                            System.out.print("Introduce la Temperatura Mínima: ");
                            temperaturas.add(read.nextFloat()); read.nextLine();
                        }
                        
                        // ! Agregamos el Contacto a la Agenda
                        state = Methods.newTemperature(cadena, temperaturas);
                    } while (!state);
                break;
            }
            
            if () { // ? Si la opción es diferente a SALIR 

            }
        } while (option != SALIR);

        // ^ Cerramos el Scanner
        read.close();
    }
}
