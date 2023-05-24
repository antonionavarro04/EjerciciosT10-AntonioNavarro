package ficheros.ejercicio7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
    private static final String DIR = "mixed\\ejercicio7";
    private static final String FILE = "Agenda.csv";
    private static final String ROUTE = DIR + "\\" + FILE;

    protected static final char SALIR = '4';
    protected static TreeMap<String, Integer> agenda = new TreeMap<String, Integer>();

    public static void main(String[] args) {
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
                bw = new BufferedWriter(new FileWriter(file));
                bw.write("Nombre,Numero"); // ! Escribimos la cabecera del csv
                bw.newLine();
            } catch (IOException e) {
                System.err.printf("Ha ocurrido un error al crear el archivo, ruta: \"%s\"\n", ROUTE);
            } finally { // * Cerramos el BufferedWriter
                try {
                    bw.flush();
                    bw.close();
                } catch (IOException e) {
                    System.err.printf("Ha ocurrido un error al cerrar el archivo, ruta: \"%s\"", ROUTE);
                }
            }
        }

        // ^ Definimos un Scanner a null y otro con el flujo de entrada de System.in
        Scanner sc = null, read = new Scanner(System.in).useLocale(Locale.US);

        // ? Leemos el fichero y guardamos los datos en el HashMap
        try {
            sc = new Scanner(new BufferedReader(new FileReader(ROUTE)));
            sc.useLocale(Locale.US);
            sc.nextLine(); // ! Saltamos la cabecera del csv

            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split(",");
                agenda.put(data[0], Integer.parseInt(data[1]));
            }
        } catch (FileNotFoundException e) {
            System.err.printf("Ha ocurrido un error al leer el archivo, ruta: \"%s\"\n", ROUTE);
        } finally { // * Cerramos el Scanner
            sc.close();
        }

        /* ! CRUD ! */

        // ^ Definimos una varible char, String e int
        String cadena = "";
        int numero = 0;
        char option = SALIR;

        // ! Una vez cargado los datos en la Agenda procedemos al CRUD
        do {
            if (agenda.size() == 20) {
                System.err.println("Tu agenda ya está llena...");
            } else {
                try { // ? Intentamos leer un Character
                    System.out.print(Methods.menu());
                    option = read.nextLine().charAt(0);
                } catch (InputMismatchException e) { // ? Si se introduce una cadena vacía lanzamos un mensaje de error
                    System.err.printf("La opción '%s' no es válida\n", option);
                    option = '0';
                } finally {
                    System.out.println(); // ? Salto de Línea
                } switch (option) { // ? Procesamos la opción
                    case '1':
                        boolean state = true;
                        do {
                            if (!state) {
                                System.err.printf("El contacto \"%s\" ya existe.\nIntroduce otro nombre para %s\n\n", cadena, numero);
                            }

                            System.out.print("Introuduce el Nombre: ");
                            cadena = read.nextLine();
                            if (state) { // ? Si es la primera vez cogemos el numero, las demás veces no
                                System.out.print("Introduce el Teléfono: ");
                                numero = read.nextInt(); read.nextLine();
                            }
                            
                            // ! Agregamos el Contacto a la Agenda
                            state = Methods.newContact(cadena, numero);
                        } while (!state);
                        break;
                
                    case '2':
                        // TODO | Methods.searchContact(cadena);
                        break;
    
                    case '3':
                        System.out.printf("Lista de Contactos:\n%s\n", Methods.printContact());
                        break;
    
                    case SALIR:
                        System.out.println("Saliendo...");
                        break;
                        
                    default:
                        continue;
                } if (option != SALIR) {
                    System.out.println("Pulsa 'enter' para continuar...");
                    read.nextLine();
                }
            }
        } while (option != SALIR);

        // TODO | SAVE DATA

        // ^ Cerramos el Scanner
        read.close();
    }
}
