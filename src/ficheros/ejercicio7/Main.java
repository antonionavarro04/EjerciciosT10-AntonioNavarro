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
import java.util.Map;
import java.util.Scanner;

// ? Para este caso en concreto lo mas Adecuado es usar un Map, ya que necesitamos pares clave valor siendo Nombre-Numero. Dentro de los mapas el mas adecuado es el TreeMap, ya que nos ordena los datos por clave, aunque cualquier otro serviría.
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
            } catch (IOException e) {
                System.err.printf("Ha ocurrido un error al crear el archivo, ruta: \"%s\"\n", ROUTE);
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
                        System.out.print("Introduce el Nombre: ");
                        cadena = read.nextLine();

                        System.out.println(Methods.searchContact(cadena));
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

        try {
            // ! Abrimos el Archivo en modo Write
            bw = new BufferedWriter(new FileWriter(file, false));

            // ! Vaciamos el Archivo y escribimos la cabecera de CSV
            bw.write("Nombre,Telefono");
            bw.newLine();
            bw.flush();
            bw.close();

            // ! Abrimos el Archivo en modo Append
            bw = new BufferedWriter(new FileWriter(file, true));

            // ! Recorremos los valores del Array y los escribimos en el Archivo
            for (Map.Entry<String, Integer> entry : agenda.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue().toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.printf("Ha ocurrido un error al guardar los datos, ruta: \"%s\"\n", ROUTE);
        } finally {
            if (bw != null) {
                try {
                    bw.flush();
                    bw.close();
                } catch (IOException e) {
                    System.err.printf("Ha ocurrido un error al cerrar el archivo, ruta: \"%s\"\n", ROUTE);
                }
            }
        }

        // ^ Cerramos el Scanner
        read.close();
    }
}
