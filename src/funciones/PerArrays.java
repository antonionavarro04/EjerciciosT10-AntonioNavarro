package funciones;

// ? Imports
import java.lang.System;
import java.util.Arrays;
import java.lang.Math;
import java.lang.String;
import java.util.Scanner;
import java.util.Locale;

/**
 * Esta clase contiene todos los métodos para el manejo sencillo de Arrays, en el se pueden encontrar métodos de impresión, rellenado, copia, inserción y eliminación
 * Esta orientada a su uso en el examen del Tema 5 de programación
 * Falta por implementar el rellenado de arrays[][]
 * Falta por implementar todos los arrays de Objetos[] && [][]
 * @author Antonio Navarro
 * @version Beta 2.0
 * @see java.lang.System
 * @see java.util.Arrays
 * @see java.lang.Math
 * @see java.lang.String
 * @see java.util.Scanner
 * @see java.util.Locale
 * @see Mathematics
 */
public class PerArrays {
    /**
     * Constructor por Defecto
     */
    public PerArrays () {
        // // Default Constructor
    }

    /**
     * Scanner utilizado en los métodos scannerFill()
     */
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    // ! Print
    // = 1d
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(int[] a) {
        System.out.print("[");
        if (a.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.println("]");
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(double[] a) {
        System.out.print("[");
        if (a.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.println("]");
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(String[] a) {
        System.out.print("[");
        if (a.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.println("]");
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(float[] a) {
        System.out.print("[");
        if (a.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.println("]");
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(long[] a) {
        System.out.print("[");
        if (a.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.println("]");
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(char[] a) {
        System.out.print("[");
        if (a.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.println("]");
    }

    // = 2d
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(String a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            } System.out.println();
        }
    }

    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(char a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            } System.out.println();
        }
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            } System.out.println();
        }
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(long a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            } System.out.println();
        }
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(float a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            } System.out.println();
        }
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(double a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            } System.out.println();
        }
    }

    // = 3d
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(int a[][][]) {
        for (int p = 0; p < a.length; p++) {
            System.out.printf("Capa %s:\n", p);
            for (int i = 0; i < a[0].length; i++) {
                for (int j = 0; j < a[0][0].length; j++) {
                    System.out.print(a[p][i][j] + " ");
                }
                System.out.println();
            } System.out.println();
        }
    }

    // = 4d
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(int a[][][][]) {
        for (int m = 0; m < a.length; m++) {
            System.out.printf("Momento %s:\n", m);
            for (int p = 0; p < a[0].length; p++) {
                System.out.printf("Capa %s:\n", p);
                for (int i = 0; i < a[0][0].length; i++) {
                    for (int j = 0; j < a[0][0][0].length; j++) {
                        System.out.print(a[m][p][i][j] + " ");
                    }
                    System.out.println();
                } System.out.println();
            } System.out.println();
        }
    }

    // ! Fill
    // = 1d
    // * Fixed
    /**
     * Método que rellena un array con el mismo elemento
     * @param a Array a rellenar
     * @param s Elemento con el que rellenar
     * @return Array ya rellenado
     */
    public static String[] fillArray(String a[], String s) {
        for (int i = 0; i < a.length; i++) {
            a[i] = s;
        } return a;
    }
    
    /**
     * Método que rellena un array con el mismo elemento
     * @param a Array a rellenar
     * @param c Elemento con el que rellenar
     * @return Array ya rellenado
     */
    public static char[] fillArray(char a[], char c) {
        for (int i = 0; i < a.length; i++) {
            a[i] = c;
        } return a;
    }
    
    /**
     * Método que rellena un array con el mismo elemento
     * @param a Array a rellenar
     * @param n Elemento con el que rellenar
     * @return Array ya rellenado
     */
    public static int[] fillArray(int a[], int n) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
        } return a;
    }
    
    /**
     * Método que rellena un array con el mismo elemento
     * @param a Array a rellenar
     * @param n Elemento con el que rellenar
     * @return Array ya rellenado
     */
    public static double[] fillArray(double a[], double n) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
        } return a;
    }
    
    /**
     * Método que rellena un array con el mismo elemento
     * @param a Array a rellenar
     * @param n Elemento con el que rellenar
     * @return Array ya rellenado
     */
    public static long[] fillArray(long a[], long n) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
        } return a;
    }
    
    /**
     * Método que rellena un array con el mismo elemento
     * @param a Array a rellenar
     * @param n Elemento con el que rellenar
     * @return Array ya rellenado
     */
    public static float[] fillArray(float a[], float n) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
        } return a;
    }

    // * Incremental
    /**
     * Método que rellena un array con caracteres de forma incremental, estos caracteres no podrán ser ni mayores a 127 ni menores a 33
     * @param a Array a rellenar
     * @param c Elemento base
     * @param in Incremento para el elemento
     * @throws IllegalArgumentException Lanza una excepción en caso de que el incremento sea mayor a 128, ya que los caracteres usan la tabla ASCII de códigos
     * @return Array ya rellenado
     */
    public static char[] fillArray(char a[], char c, int in) {
        if (in > 127) {
            throw new IllegalArgumentException("Increment must be less than 128");
        } if (c <= 32) {
            c = 33;
        } for (int i = 0; i < a.length; i++) {
            a[i] = c;
            c += in;
            if (c > 128) {
                c = 33;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array numérico de forma incremental
     * @param a Array a rellenar
     * @param n Elemento base
     * @param in Incremento para el elemento
     * @return Array ya rellenado
     */
    public static int[] fillArray(int a[], int n, int in) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
            n += in;
        } return a;
    }
    
    /**
     * Método que rellena un array numérico de forma incremental
     * @param a Array a rellenar
     * @param n Elemento base
     * @param in Incremento para el elemento
     * @return Array ya rellenado
     */
    public static float[] fillArray(float a[], float n, float in) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
            n += in;
        } return a;
    }
    
    /**
     * Método que rellena un array numérico de forma incremental
     * @param a Array a rellenar
     * @param n Elemento base
     * @param in Incremento para el elemento
     * @return Array ya rellenado
     */
    public static double[] fillArray(double a[], double n, double in) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
            n += in;
        } return a;
    }
    
    /**
     * Método que rellena un array numérico de forma incremental
     * @param a Array a rellenar
     * @param n Elemento base
     * @param in Incremento para el elemento
     * @return Array ya rellenado
     */
    public static long[] fillArray(long a[], long n, long in) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
            n += in;
        } return a;
    }

    // * Random
    /**
     * Método que rellena un array de caracteres con caracteres comprendidos entre el 33 y el 128
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static char[] fillArrayRandom(char a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (Mathematics.rng(128, 33));
        } return a;
    }
    
    /**
     * Método que rellena un array con 0 y 1
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static int[] fillArrayRandom(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (Mathematics.rng(1, 0));
        } return a;
    }

    /**
     * Método que rellena un array con 0 y 1
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static long[] fillArrayRandom(long a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (Mathematics.rng(1L, 0L));
        } return a;
    }

    /**
     * Método que rellena un array con valores entre 0 y x inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @return Array ya relleno
     */
    public static int[] fillArrayRandom(int a[], int max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * max + 0.5d);
        } return a;
    }

    /**
     * Método que rellena un array con valores entre 0 y x inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @return Array ya relleno
     */
    public static long[] fillArrayRandom(long a[], long max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (long) (Math.random() * max + 0.5d);
        } return a;
    }

    /**
     * Método que rellena un array con valores entre x y y inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @param min Número mínimo a generar
     * @return Array ya relleno
     */
    public static int[] fillArrayRandom(int a[], int max, int min) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min) + (min + 0.5d));
        } return a;
    }

    /**
     * Método que rellena un array con valores entre x y y inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @param min Número mínimo a generar
     * @return Array ya relleno
     */
    public static long[] fillArrayRandom(long a[], long max, long min) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (long) (Math.random() * (max - min) + (min + 0.5d));
        } return a;
    }

    // * Scanner
    /**
     * Método que rellena un array con valores introducidos por teclado
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static int[] fillScanner(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("[%s] >>> ", i);
            a[i] = read.nextInt();
        } return a;
    }
    
    /**
     * Método que rellena un array con valores introducidos por teclado
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static long[] fillScanner(long a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("[%s] >>> ", i);
            a[i] = read.nextLong();
        } return a;
    }
    
    /**
     * Método que rellena un array con valores introducidos por teclado
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static float[] fillScanner(float a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("[%s] >>> ", i);
            a[i] = read.nextFloat();
        } return a;
    }
    
    /**
     * Método que rellena un array con valores introducidos por teclado
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static double[] fillScanner(double a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("[%s] >>> ", i);
            a[i] = read.nextDouble();
        } return a;
    }
    
    /**
     * Método que rellena un array con valores introducidos por teclado
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static char[] fillScanner(char a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("[%s] >>> ", i);
            a[i] = read.nextLine().charAt(0);
        } return a;
    }
    
    /**
     * Método que rellena un array con valores introducidos por teclado
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static String[] fillScanner(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("[%s] >>> ", i);
            a[i] = read.nextLine(); read.nextLine(); // ? Limpiamos el Buffer
        } return a;
    }

    // = 2d
    // * Fixed
    /**
     * Método que rellena un array con una cadena fija
     * @param a Array a rellenar
     * @param s Cadena con la que rellenar
     * @return Array ya rellenado
     */
    public static String[][] fillArray(String a[][], String s) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = s;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array con un caracter fijo
     * @param a Array a rellenar
     * @param c Caracter con el que rellenar
     * @return Array ya rellenado
     */
    public static char[][] fillArray(char a[][], char c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = c;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array con valores numéricos
     * @param a Array a rellenar
     * @param n Número con el que rellenar
     * @return Array ya rellenado
     */
    public static int[][] fillArray(int a[][], int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
            }
        } return a;
    }

    /**
     * Método que rellena un array con valores numéricos
     * @param a Array a rellenar
     * @param n Número con el que rellenar
     * @return Array ya rellenado
     */
    public static double[][] fillArray(double a[][], double n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array con valores numéricos
     * @param a Array a rellenar
     * @param n Número con el que rellenar
     * @return Array ya rellenado
     */
    public static long[][] fillArray(long a[][], long n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array con valores numéricos
     * @param a Array a rellenar
     * @param n Número con el que rellenar
     * @return Array ya rellenado
     */
    public static float[][] fillArray(float a[][], float n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
            }
        } return a;
    }

    // * Incremental
    /**
     * Método que rellena un array con caracteres de manera incremetal
     * @param a Array a rellenar
     * @param c Caracter base
     * @param in Incremento para el caracter base
     * @throws IllegalArgumentException Lanza una excepción en caso de que el incremento sea mayor a 128, ya que los caracteres usan la tabla ASCII de códigos
     * @return Array ya rellenado
     */
    public static char[][] fillArray(char a[][], char c, int in) {
        if (in >= 127) {
            throw new IllegalArgumentException("Increment must be less than 127");
        } if (c <= 32) {
            c = 33;
        } for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = c;
                c += in;
                if (c > 128) {
                    c = 33;
                }
            }
        } return a;
    }
    
    /**
     * Método que rellena un array de manera incremental con valores numéricos
     * @param a Array a rellenar
     * @param n Número base
     * @param in Incremento con el que incrementar el número base
     * @return Array ya rellenado
     */
    public static int[][] fillArray(int a[][], int n, int in) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
                n += in;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array de manera incremental con valores numéricos
     * @param a Array a rellenar
     * @param n Número base
     * @param in Incremento con el que incrementar el número base
     * @return Array ya rellenado
     */
    public static long[][] fillArray(long a[][], long n, long in) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
                n += in;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array de manera incremental con valores numéricos
     * @param a Array a rellenar
     * @param n Número base
     * @param in Incremento con el que incrementar el número base
     * @return Array ya rellenado
     */
    public static double[][] fillArray(double a[][], double n, double in) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
                n += in;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array de manera incremental con valores numéricos
     * @param a Array a rellenar
     * @param n Número base
     * @param in Incremento con el que incrementar el número base
     * @return Array ya rellenado
     */
    public static float[][] fillArray(float a[][], float n, float in) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
                n += in;
            }
        } return a;
    }

    // * Random
    /**
     * Método que rellena un array con caracteres aleatorios
     * @param a Array a rellenar
     * @return Array ya rellenado
     */
    public static char[][] fillArrayRandom(char a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (char) (Mathematics.rng(128, 33));
            }
        } return a;
    }

    /**
     * Método que rellena un array con 0 y 1 !!! No Funciona !!!
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static long[][] fillArrayRandom(long a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = Mathematics.rng(1, 0);
            }
        } return a;
    }

    /**
     * Método que rellena un array con 0 y 1 !!! No Funciona !!!
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static int[][] fillArrayRandom(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = Mathematics.rng(1, 0);
            }
        } return a;
    }

    /**
     * Método que rellenar un array con valores entre 0 y x inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @return Array ya relleno
     */
    public static int[][] fillArrayRandom(int a[][], int max) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.random() * (max + 0.5d));
            }
        } return a;
    }
    
    /**
     * Método que rellenar un array con valores entre x e y inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @param min Número mínimo a generar
     * @return Array ya relleno
     */
    public static int[][] fillArrayRandom(int a[][], int max, int min) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.random() * (max - min) + (min + 0.5d));;
            }
        } return a;
    }

    /**
     * Método que rellenar un array con valores entre 0 y x inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @return Array ya relleno
     */
    public static long[][] fillArrayRandom(long a[][], long max) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (long) (Math.random() * (max + 0.5d));
            }
        } return a;
    }
    
    /**
     * Método que rellenar un array con valores entre x e y inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @param min Número mínimo a generar
     * @return Array ya relleno
     */
    public static long[][] fillArrayRandom(long a[][], long max, long min) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (long) (Math.random() * (max - min) + (min + 0.5d));;
            }
        } return a;
    }

    // * Scanner
    // CHEKPOINT
    public static void fillScanner(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("[%s][%s] >>> ", i, j);
                a[i][j] = read.nextInt();
            }
        }
    }

    // ! Búsqueda
    // = Coordenadas 2d
    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más grande
     * @param array Array en el que buscar el número máximo
     * @return Array unidimensional en el que: array[0] = posición y | array[1] = posicion x
     */
    public static long[] coordenadasMaximo(long array[][]) {
        long numeroMaximo = array[0][0];
        long[] posicionesMaximo = new long[2];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximo[0] = filas;
                    posicionesMaximo[1] = columnas;
                }
            }
        } return posicionesMaximo;
    }
    
    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más pequeño
     * @param array Array en el que buscar el número mínimo
     * @return Array unidimensional en el que: array[0] = posición y | array[1] = posicion x
     */
    public static long[] coordenadasMinimo(long array[][]) {
        long numeroMinimo = array[0][0];
        long[] posicionesMinimo = new long[2];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMinimo[0] = filas;
                    posicionesMinimo[1] = columnas;
                }
            }
        } return posicionesMinimo;
    }
    
    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más grande y el más pequeño
     * @param array Array en el que buscar el número máximo y mínimo
     * @return Array unidimensional en el que: array[0] = posición yMax | array[1] = posicion xMax || array[2] = posición yMin | array[3] = posicion xMin
     */
    public static long[] coordenadasMaximoYMinimo(long array[][]) { // * Devuelve las coordenadas a la vez por lo que habrá que descomprimirlo en cada array correspondiente, siendo [0] u [1] el máximo y [2] o [3] el mínimo
        long numeroMaximo = array[0][0];
        long numeroMinimo = array[0][0];
        long[] posicionesMaximoYMinimo = new long[4];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximoYMinimo[0] = filas;
                    posicionesMaximoYMinimo[1] = columnas;
                } if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMaximoYMinimo[2] = filas;
                    posicionesMaximoYMinimo[3] = columnas;
                }
            }
        } return posicionesMaximoYMinimo;
    }

    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más grande
     * @param array Array en el que buscar el número máximo
     * @return Array unidimensional en el que: array[0] = posición y | array[1] = posicion x
     */
    public static int[] coordenadasMaximo(int array[][]) {
        int numeroMaximo = array[0][0];
        int[] posicionesMaximo = new int[2];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximo[0] = filas;
                    posicionesMaximo[1] = columnas;
                }
            }
        } return posicionesMaximo;
    }
    
    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más pequeño
     * @param array Array en el que buscar el número mínimo
     * @return Array unidimensional en el que: array[0] = posición y | array[1] = posicion x
     */
    public static int[] coordenadasMinimo(int array[][]) {
        int numeroMinimo = array[0][0];
        int[] posicionesMinimo = new int[2];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMinimo[0] = filas;
                    posicionesMinimo[1] = columnas;
                }
            }
        } return posicionesMinimo;
    }
    
    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más grande y el más pequeño
     * @param array Array en el que buscar el número máximo y mínimo
     * @return Array unidimensional en el que: array[0] = posición yMax | array[1] = posicion xMax || array[2] = posición yMin | array[3] = posicion xMin
     */
    public static int[] coordenadasMaximoYMinimo(int array[][]) { // * Devuelve las coordenadas a la vez por lo que habrá que descomprimirlo en cada array correspondiente, siendo [0] u [1] el máximo y [2] o [3] el mínimo
        int numeroMaximo = array[0][0];
        int numeroMinimo = array[0][0];
        int[] posicionesMaximoYMinimo = new int[4];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximoYMinimo[0] = filas;
                    posicionesMaximoYMinimo[1] = columnas;
                } if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMaximoYMinimo[2] = filas;
                    posicionesMaximoYMinimo[3] = columnas;
                }
            }
        } return posicionesMaximoYMinimo;
    }

    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más grande
     * @param array Array en el que buscar el número máximo
     * @return Array unidimensional en el que: array[0] = posición y | array[1] = posicion x
     */
    public static double[] coordenadasMaximo(double array[][]) {
        double numeroMaximo = array[0][0];
        double[] posicionesMaximo = new double[2];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximo[0] = filas;
                    posicionesMaximo[1] = columnas;
                }
            }
        } return posicionesMaximo;
    }
    
    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más pequeño
     * @param array Array en el que buscar el número mínimo
     * @return Array unidimensional en el que: array[0] = posición y | array[1] = posicion x
     */
    public static double[] coordenadasMinimo(double array[][]) {
        double numeroMinimo = array[0][0];
        double[] posicionesMinimo = new double[2];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMinimo[0] = filas;
                    posicionesMinimo[1] = columnas;
                }
            }
        } return posicionesMinimo;
    }
    
    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más grande y el más pequeño
     * @param array Array en el que buscar el número máximo y mínimo
     * @return Array unidimensional en el que: array[0] = posición yMax | array[1] = posicion xMax || array[2] = posición yMin | array[3] = posicion xMin
     */
    public static double[] coordenadasMaximoYMinimo(double array[][]) { // * Devuelve las coordenadas a la vez por lo que habrá que descomprimirlo en cada array correspondiente, siendo [0] u [1] el máximo y [2] o [3] el mínimo
        double numeroMaximo = array[0][0];
        double numeroMinimo = array[0][0];
        double[] posicionesMaximoYMinimo = new double[4];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximoYMinimo[0] = filas;
                    posicionesMaximoYMinimo[1] = columnas;
                } if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMaximoYMinimo[2] = filas;
                    posicionesMaximoYMinimo[3] = columnas;
                }
            }
        } return posicionesMaximoYMinimo;
    }

    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más grande
     * @param array Array en el que buscar el número máximo
     * @return Array unidimensional en el que: array[0] = posición y | array[1] = posicion x
     */
    public static float[] coordenadasMaximo(float array[][]) {
        float numeroMaximo = array[0][0];
        float[] posicionesMaximo = new float[2];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximo[0] = filas;
                    posicionesMaximo[1] = columnas;
                }
            }
        } return posicionesMaximo;
    }
    
    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más pequeño
     * @param array Array en el que buscar el número mínimo
     * @return Array unidimensional en el que: array[0] = posición y | array[1] = posicion x
     */
    public static float[] coordenadasMinimo(float array[][]) {
        float numeroMinimo = array[0][0];
        float[] posicionesMinimo = new float[2];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMinimo[0] = filas;
                    posicionesMinimo[1] = columnas;
                }
            }
        } return posicionesMinimo;
    }
    
    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más grande y el más pequeño
     * @param array Array en el que buscar el número máximo y mínimo
     * @return Array unidimensional en el que: array[0] = posición yMax | array[1] = posicion xMax || array[2] = posición yMin | array[3] = posicion xMin
     */
    public static float[] coordenadasMaximoYMinimo(float array[][]) { // * Devuelve las coordenadas a la vez por lo que habrá que descomprimirlo en cada array correspondiente, siendo [0] u [1] el máximo y [2] o [3] el mínimo
        float numeroMaximo = array[0][0];
        float numeroMinimo = array[0][0];
        float[] posicionesMaximoYMinimo = new float[4];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximoYMinimo[0] = filas;
                    posicionesMaximoYMinimo[1] = columnas;
                } if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMaximoYMinimo[2] = filas;
                    posicionesMaximoYMinimo[3] = columnas;
                }
            }
        } return posicionesMaximoYMinimo;
    }
    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más grande
     * @param array Array en el que buscar el número máximo
     * @return Array unidimensional en el que: array[0] = posición y | array[1] = posicion x
     */
    public static char[] coordenadasMaximo(char array[][]) {
        char numeroMaximo = array[0][0];
        char[] posicionesMaximo = new char[2];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximo[0] = (char) filas;
                    posicionesMaximo[1] = (char) columnas;
                }
            }
        } return posicionesMaximo;
    }
    
    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más pequeño
     * @param array Array en el que buscar el número mínimo
     * @return Array unidimensional en el que: array[0] = posición y | array[1] = posicion x
     */
    public static char[] coordenadasMinimo(char array[][]) {
        char numeroMinimo = array[0][0];
        char[] posicionesMinimo = new char[2];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMinimo[0] = (char) filas;
                    posicionesMinimo[1] = (char) columnas;
                }
            }
        } return posicionesMinimo;
    }
    
    /**
     * Método que recorrerá todos los valores del array hasta encontar el número más grande y el más pequeño
     * @param array Array en el que buscar el número máximo y mínimo
     * @return Array unidimensional en el que: array[0] = posición yMax | array[1] = posicion xMax || array[2] = posición yMin | array[3] = posicion xMin
     */
    public static char[] coordenadasMaximoYMinimo(char array[][]) { // * Devuelve las coordenadas a la vez por lo que habrá que descomprimirlo en cada array correspondiente, siendo [0] u [1] el máximo y [2] o [3] el mínimo
        char numeroMaximo = array[0][0];
        char numeroMinimo = array[0][0];
        char[] posicionesMaximoYMinimo = new char[4];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximoYMinimo[0] = (char) filas;
                    posicionesMaximoYMinimo[1] = (char) columnas;
                } if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMaximoYMinimo[2] = (char) filas;
                    posicionesMaximoYMinimo[3] = (char) columnas;
                }
            }
        } return posicionesMaximoYMinimo;
    }

    /**
     * Imprime las coordenadas de un array, sirve para los métodos de coordenadas
     * @param array Array en el que se encuentran las coordenadas
     */
    public static void printCords(int[] array) {
        System.out.print("[");
        if (array.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int pos = 0; pos < array.length; pos++) {
                if (pos == 0) {
                    System.out.print("y = ");
                } else {
                    System.out.print("x = ");
                } System.out.print(array[pos]);
                if (pos != array.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.print("]"); System.out.println();
    }

    /**
     * Imprime las coordenadas de un array, sirve para los métodos de coordenadas
     * @param array Array en el que se encuentran las coordenadas
     */
    public static void printCords(long[] array) {
        System.out.print("[");
        if (array.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int pos = 0; pos < array.length; pos++) {
                if (pos == 0) {
                    System.out.print("y = ");
                } else {
                    System.out.print("x = ");
                } System.out.print(array[pos]);
                if (pos != array.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.print("]"); System.out.println();
    }

    /**
     * Imprime las coordenadas de un array, sirve para los métodos de coordenadas
     * @param array Array en el que se encuentran las coordenadas
     */
    public static void printCords(float[] array) {
        System.out.print("[");
        if (array.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int pos = 0; pos < array.length; pos++) {
                if (pos == 0) {
                    System.out.print("y = ");
                } else {
                    System.out.print("x = ");
                } System.out.print(array[pos]);
                if (pos != array.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.print("]"); System.out.println();
    }

    /**
     * Imprime las coordenadas de un array, sirve para los métodos de coordenadas
     * @param array Array en el que se encuentran las coordenadas
     */
    public static void printCords(double[] array) {
        System.out.print("[");
        if (array.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int pos = 0; pos < array.length; pos++) {
                if (pos == 0) {
                    System.out.print("y = ");
                } else {
                    System.out.print("x = ");
                } System.out.print(array[pos]);
                if (pos != array.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.print("]"); System.out.println();
    }

    /**
     * Imprime las coordenadas de un array, sirve para los métodos de coordenadas
     * @param array Array en el que se encuentran las coordenadas
     */
    public static void printCords(char[] array) {
        System.out.print("[");
        if (array.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int pos = 0; pos < array.length; pos++) {
                if (pos == 0) {
                    System.out.print("y = ");
                } else {
                    System.out.print("x = ");
                } System.out.print(array[pos]);
                if (pos != array.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.print("]"); System.out.println();
    }

    // ! Transponer matriz
    /**
     * Método que transpone una matriz
     * @param matrix Matriz a transponer
     * @return Matriz transpuesta
     */
    public static int[][] transponerArray(int matrix[][]) { // * Solo necesita una variable auxiliar
        int aux;
        for (int filas = 0; filas < matrix.length; filas++) {
            for (int columnas = filas; columnas < matrix[0].length; columnas++) {
                if (columnas != filas) {
                    aux = matrix[columnas][filas];
                    matrix[columnas][filas] = matrix [filas][columnas];
                    matrix[filas][columnas] = aux;
                }
            }
        } return matrix;
    }
    
    /**
     * Método que transpone una matriz
     * @param matrix Matriz a transponer
     * @return Matriz transpuesta
     */
    public static long[][] transponerArray(long matrix[][]) { // * Solo necesita una variable auxiliar
        long aux;
        for (int filas = 0; filas < matrix.length; filas++) {
            for (int columnas = filas; columnas < matrix[0].length; columnas++) {
                if (columnas != filas) {
                    aux = matrix[columnas][filas];
                    matrix[columnas][filas] = matrix [filas][columnas];
                    matrix[filas][columnas] = aux;
                }
            }
        } return matrix;
    }
    
    /**
     * Método que transpone una matriz
     * @param matrix Matriz a transponer
     * @return Matriz transpuesta
     */
    public static float[][] transponerArray(float matrix[][]) { // * Solo necesita una variable auxiliar
        float aux;
        for (int filas = 0; filas < matrix.length; filas++) {
            for (int columnas = filas; columnas < matrix[0].length; columnas++) {
                if (columnas != filas) {
                    aux = matrix[columnas][filas];
                    matrix[columnas][filas] = matrix [filas][columnas];
                    matrix[filas][columnas] = aux;
                }
            }
        } return matrix;
    }
    
    /**
     * Método que transpone una matriz
     * @param matrix Matriz a transponer
     * @return Matriz transpuesta
     */
    public static double[][] transponerArray(double matrix[][]) { // * Solo necesita una variable auxiliar
        double aux;
        for (int filas = 0; filas < matrix.length; filas++) {
            for (int columnas = filas; columnas < matrix[0].length; columnas++) {
                if (columnas != filas) {
                    aux = matrix[columnas][filas];
                    matrix[columnas][filas] = matrix [filas][columnas];
                    matrix[filas][columnas] = aux;
                }
            }
        } return matrix;
    }
    
    /**
     * Método que transpone una matriz
     * @param matrix Matriz a transponer
     * @return Matriz transpuesta
     */
    public static char[][] transponerArray(char matrix[][]) { // * Solo necesita una variable auxiliar
        char aux;
        for (int filas = 0; filas < matrix.length; filas++) {
            for (int columnas = filas; columnas < matrix[0].length; columnas++) {
                if (columnas != filas) {
                    aux = matrix[columnas][filas];
                    matrix[columnas][filas] = matrix [filas][columnas];
                    matrix[filas][columnas] = aux;
                }
            }
        } return matrix;
    }

    // ! Comprobar si es simétrica
    /**
     * Método para comprobar si una matriz es simétrica
     * @param matrix Mátriz a comprobar
     * @return true si es simetrica y false si no es simetrica
     */
    public static boolean simmetrical(int[][] matrix) {
        boolean simmetric = true;
        for (int filas = 0; filas < matrix.length; filas++) {
            for (int columnas = 0; columnas < matrix[0].length; columnas++) {
                if (matrix[filas][columnas] != matrix[columnas][filas]) {
                    simmetric = false;
                    break;
                }
            } if (!simmetric) {
                break;
            }
        } return simmetric;
    }

    /**
     * Método para comprobar si una matriz es simétrica
     * @param matrix Mátriz a comprobar
     * @return true si es simetrica y false si no es simetrica
     */
    public static boolean simmetrical(double[][] matrix) {
        boolean simmetric = true;
        for (int filas = 0; filas < matrix.length; filas++) {
            for (int columnas = 0; columnas < matrix[0].length; columnas++) {
                if (matrix[filas][columnas] != matrix[columnas][filas]) {
                    simmetric = false;
                    break;
                }
            } if (!simmetric) {
                break;
            }
        } return simmetric;
    }

    /**
     * Método para comprobar si una matriz es simétrica
     * @param matrix Mátriz a comprobar
     * @return true si es simetrica y false si no es simetrica
     */
    public static boolean simmetrical(float[][] matrix) {
        boolean simmetric = true;
        for (int filas = 0; filas < matrix.length; filas++) {
            for (int columnas = 0; columnas < matrix[0].length; columnas++) {
                if (matrix[filas][columnas] != matrix[columnas][filas]) {
                    simmetric = false;
                    break;
                }
            } if (!simmetric) {
                break;
            }
        } return simmetric;
    }
    
    /**
     * Método para comprobar si una matriz es simétrica
     * @param matrix Mátriz a comprobar
     * @return true si es simetrica y false si no es simetrica
     */
    public static boolean simmetrical(long[][] matrix) {
        boolean simmetric = true;
        for (int filas = 0; filas < matrix.length; filas++) {
            for (int columnas = 0; columnas < matrix[0].length; columnas++) {
                if (matrix[filas][columnas] != matrix[columnas][filas]) {
                    simmetric = false;
                    break;
                }
            } if (!simmetric) {
                break;
            }
        } return simmetric;
    }
    
    /**
     * Método para comprobar si una matriz es simétrica
     * @param matrix Mátriz a comprobar
     * @return true si es simetrica y false si no es simetrica
     */
    public static boolean simmetrical(char[][] matrix) {
        boolean simmetric = true;
        for (int filas = 0; filas < matrix.length; filas++) {
            for (int columnas = 0; columnas < matrix[0].length; columnas++) {
                if (matrix[filas][columnas] != matrix[columnas][filas]) {
                    simmetric = false;
                    break;
                }
            } if (!simmetric) {
                break;
            }
        } return simmetric;
    }

    // ! Inserar datos
    /**
     * Método utilizado para insertar datos al final de un array
     * @param array Array en el que introducir el dato
     * @param data Dato a introducir
     * @return Array con el dato ya insertado
     */
    public static int[] insertData(int array[], int data) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = data;
        return array;
    }

    /**
     * Método utilizado para insertar datos al final de un array
     * @param array Array en el que introducir el dato
     * @param data Dato a introducir
     * @return Array con el dato ya insertado
     */
    public static long[] insertData(long array[], long data) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = data;
        return array;
    }
    
    /**
     * Método utilizado para insertar datos al final de un array
     * @param array Array en el que introducir el dato
     * @param data Dato a introducir
     * @return Array con el dato ya insertado
     */
    public static float[] insertData(float array[], float data) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = data;
        return array;
    }
    
    /**
     * Método utilizado para insertar datos al final de un array
     * @param array Array en el que introducir el dato
     * @param data Dato a introducir
     * @return Array con el dato ya insertado
     */
    public static double[] insertData(double array[], double data) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = data;
        return array;
    }
    
    /**
     * Método utilizado para insertar datos al final de un array
     * @param array Array en el que introducir el dato
     * @param data Dato a introducir
     * @return Array con el dato ya insertado
     */
    public static char[] insertData(char array[], char data) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = data;
        return array;
    }
    
    /**
     * Método utilizado para insertar datos al final de un array
     * @param array Array en el que introducir el dato
     * @param data Dato a introducir
     * @return Array con el dato ya insertado
     */
    public static String[] insertData(String array[], String data) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = data;
        return array;
    }

    /**
     * Método utilizado para insertar datos al final de un array
     * @param array Array en el que introducir el dato
     * @param data Dato a introducir
     * @return Array con el dato ya insertado
     */
    public static Object[] insertData(Object array[], Object data) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = data;
        return array;
    }

    // ! Eliminación
    // = Binaria
    /**
     * Método para eliminar un dato en base a el elemento a borrar
     * @param originalArray Array original en el que borrar el elemento, debe estar ordenado
     * @param numberToBeSearched Elemento a buscar
     * @return Array con el elemento eliminado
     */
    public static int[] deleteData(int originalArray[], int numberToBeSearched) { // ? Must be Ordered
        int newArray[] = originalArray;
        int indexOfSearched = Arrays.binarySearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    /**
     * Método para eliminar un dato en base a el elemento a borrar
     * @param originalArray Array original en el que borrar el elemento, debe estar ordenado
     * @param numberToBeSearched Elemento a buscar
     * @return Array con el elemento eliminado
     */
    public static long[] deleteData(long originalArray[], long numberToBeSearched) { // ? Must be Ordered
        long newArray[] = originalArray;
        int indexOfSearched = Arrays.binarySearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }

    /**
     * Método para eliminar un dato en base a el elemento a borrar
     * @param originalArray Array original en el que borrar el elemento, debe estar ordenado
     * @param numberToBeSearched Elemento a buscar
     * @return Array con el elemento eliminado
     */
    public static float[] deleteData(float originalArray[], float numberToBeSearched) { // ? Must be Ordered
        float newArray[] = originalArray;
        int indexOfSearched = Arrays.binarySearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }

    /**
     * Método para eliminar un dato en base a el elemento a borrar
     * @param originalArray Array original en el que borrar el elemento, debe estar ordenado
     * @param numberToBeSearched Elemento a buscar
     * @return Array con el elemento eliminado
     */
    public static double[] deleteData(double originalArray[], double numberToBeSearched) { // ? Must be Ordered
        double newArray[] = originalArray;
        int indexOfSearched = Arrays.binarySearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }

    /**
     * Método para eliminar un dato en base a el elemento a borrar
     * @param originalArray Array original en el que borrar el elemento, debe estar ordenado
     * @param numberToBeSearched Elemento a buscar
     * @return Array con el elemento eliminado
     */
    public static char[] deleteData(char originalArray[], char numberToBeSearched) { // ? Must be Ordered
        char newArray[] = originalArray;
        int indexOfSearched = Arrays.binarySearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }

    /**
     * Método para eliminar un dato en base a el elemento a borrar
     * @param originalArray Array original en el que borrar el elemento, debe estar ordenado
     * @param numberToBeSearched Elemento a buscar
     * @return Array con el elemento eliminado
     */
    public static String[] deleteData(String originalArray[], String numberToBeSearched) { // ? Must be Ordered
        String newArray[] = originalArray;
        int indexOfSearched = Arrays.binarySearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    // = Secuencial
    /**
     * Método para eliminar un dato en base a el elemento a borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param numberToBeSearched Elemento a buscar
     * @return Array con el elemento eliminado
     */
    public static int[] deleteUnsortedData(int originalArray[], int numberToBeSearched) { // ? Can be Ordered
        int newArray[] = originalArray;
        int indexOfSearched = secuentialSearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    /**
     * Método para eliminar un dato en base a el elemento a borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param numberToBeSearched Elemento a buscar
     * @return Array con el elemento eliminado
     */
    public static long[] deleteUnsortedData(long originalArray[], long numberToBeSearched) { // ? Can be Ordered
        long newArray[] = originalArray;
        int indexOfSearched = secuentialSearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    /**
     * Método para eliminar un dato en base a el elemento a borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param numberToBeSearched Elemento a buscar
     * @return Array con el elemento eliminado
     */
    public static float[] deleteUnsortedData(float originalArray[], float numberToBeSearched) { // ? Can be Ordered
        float newArray[] = originalArray;
        int indexOfSearched = secuentialSearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    /**
     * Método para eliminar un dato en base a el elemento a borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param numberToBeSearched Elemento a buscar
     * @return Array con el elemento eliminado
     */
    public static double[] deleteUnsortedData(double originalArray[], double numberToBeSearched) { // ? Can be Ordered
        double newArray[] = originalArray;
        int indexOfSearched = secuentialSearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    /**
     * Método para eliminar un dato en base a el elemento a borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param numberToBeSearched Elemento a buscar
     * @return Array con el elemento eliminado
     */
    public static char[] deleteUnsortedData(char originalArray[], char numberToBeSearched) { // ? Can be Ordered
        char newArray[] = originalArray;
        int indexOfSearched = secuentialSearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    /**
     * Método para eliminar un dato en base a el elemento a borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param numberToBeSearched Elemento a buscar
     * @return Array con el elemento eliminado
     */
    public static String[] deleteUnsortedData(String originalArray[], String numberToBeSearched) { // ? Can be Ordered
        String newArray[] = originalArray;
        int indexOfSearched = secuentialSearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    // = Por posicion
    /**
     * Método para eliminar un dato en base ala posición que borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param position Posicion a borrar
     * @return Array con la posición eliminada
     */
    public static int[] deleteKnowingData(int originalArray[], int position) { // ? Can be ordered
        int newArray[] = originalArray;
        int spotsToCopy = originalArray.length - position - 1;
        System.arraycopy(originalArray, position + 1, newArray, position, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    /**
     * Método para eliminar un dato en base ala posición que borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param position Posicion a borrar
     * @return Array con la posición eliminada
     */
    public static long[] deleteKnowingData(long originalArray[], int position) { // ? Can be ordered
        long newArray[] = originalArray;
        int spotsToCopy = originalArray.length - position - 1;
        System.arraycopy(originalArray, position + 1, newArray, position, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    /**
     * Método para eliminar un dato en base ala posición que borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param position Posicion a borrar
     * @return Array con la posición eliminada
     */
    public static float[] deleteKnowingData(float originalArray[], int position) { // ? Can be ordered
        float newArray[] = originalArray;
        int spotsToCopy = originalArray.length - position - 1;
        System.arraycopy(originalArray, position + 1, newArray, position, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    /**
     * Método para eliminar un dato en base ala posición que borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param position Posicion a borrar
     * @return Array con la posición eliminada
     */
    public static double[] deleteKnowingData(double originalArray[], int position) { // ? Can be ordered
        double newArray[] = originalArray;
        int spotsToCopy = originalArray.length - position - 1;
        System.arraycopy(originalArray, position + 1, newArray, position, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    /**
     * Método para eliminar un dato en base ala posición que borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param position Posicion a borrar
     * @return Array con la posición eliminada
     */
    public static char[] deleteKnowingData(char originalArray[], int position) { // ? Can be ordered
        char newArray[] = originalArray;
        int spotsToCopy = originalArray.length - position - 1;
        System.arraycopy(originalArray, position + 1, newArray, position, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
    
    /**
     * Método para eliminar un dato en base ala posición que borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param position Posicion a borrar
     * @return Array con la posición eliminada
     */
    public static String[] deleteKnowingData(String originalArray[], int position) { // ? Can be ordered
        String newArray[] = originalArray;
        int spotsToCopy = originalArray.length - position - 1;
        System.arraycopy(originalArray, position + 1, newArray, position, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }

    // ! Busqueda Secuencial
    /**
     * Método para buscar la posición de un elemento de manera secuencial
     * @param array Array en el que buscar
     * @param numberToBeSearched Elemento a buscar
     * @return Posición del primer elemento con ese valor
     */
    public static int secuentialSearch(int[] array, int numberToBeSearched) {
        int pos = 0;
        while (pos < array.length && numberToBeSearched != array[pos]) {
            pos++;
        } if (pos == array.length) {
            pos = -1;
        } return pos;
    }
    
    /**
     * Método para buscar la posición de un elemento de manera secuencial
     * @param array Array en el que buscar
     * @param numberToBeSearched Elemento a buscar
     * @return Posición del primer elemento con ese valor
     */
    public static int secuentialSearch(long[] array, long numberToBeSearched) {
        int pos = 0;
        while (pos < array.length && numberToBeSearched != array[pos]) {
            pos++;
        } if (pos == array.length) {
            pos = -1;
        } return pos;
    }
    
    /**
     * Método para buscar la posición de un elemento de manera secuencial
     * @param array Array en el que buscar
     * @param numberToBeSearched Elemento a buscar
     * @return Posición del primer elemento con ese valor
     */
    public static int secuentialSearch(float[] array, float numberToBeSearched) {
        int pos = 0;
        while (pos < array.length && numberToBeSearched != array[pos]) {
            pos++;
        } if (pos == array.length) {
            pos = -1;
        } return pos;
    }
    
    /**
     * Método para buscar la posición de un elemento de manera secuencial
     * @param array Array en el que buscar
     * @param numberToBeSearched Elemento a buscar
     * @return Posición del primer elemento con ese valor
     */
    public static int secuentialSearch(double[] array, double numberToBeSearched) {
        int pos = 0;
        while (pos < array.length && numberToBeSearched != array[pos]) {
            pos++;
        } if (pos == array.length) {
            pos = -1;
        } return pos;
    }
    
    /**
     * Método para buscar la posición de un elemento de manera secuencial
     * @param array Array en el que buscar
     * @param numberToBeSearched Elemento a buscar
     * @return Posición del primer elemento con ese valor
     */
    public static int secuentialSearch(char[] array, char numberToBeSearched) {
        int pos = 0;
        while (pos < array.length && numberToBeSearched != array[pos]) {
            pos++;
        } if (pos == array.length) {
            pos = -1;
        } return pos;
    }
    
    /**
     * Método para buscar la posición de un elemento de manera secuencial
     * @param array Array en el que buscar
     * @param numberToBeSearched Elemento a buscar
     * @return Posición del primer elemento con ese valor
     */
    public static int secuentialSearch(String[] array, String numberToBeSearched) {
        int pos = 0;
        while (pos < array.length && numberToBeSearched != array[pos]) {
            pos++;
        } if (pos == array.length) {
            pos = -1;
        } return pos;
    }
}
    