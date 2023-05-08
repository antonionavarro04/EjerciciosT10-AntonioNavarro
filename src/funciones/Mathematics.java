package funciones;

// ? Imports
import java.lang.Math;

/**
 * Esta clase contiene Métodos útiles para la aplicación rápida de calculos matemáticos.
 * Más adelante se implementarán los métodos esPrimo() y esPar().
 * Implementado el método isKaprekalar (aceptaelreto.com) https://aceptaelreto.com/problem/statement.php?id=115
 * @author Antonio Navarro
 * @version Beta 1.2
 * @see java.lang.Math
 */
public class Mathematics {
    /**
     * Constructor por Defecto
     */
    public Mathematics () {
        // // Default constructor
    }

    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Método que devuelve un número entre 0 y x inclusive
     * @param max Número Máximo a Generar
     * @return Número (int) aleatorio
     */
    public static int rng(int max) {
        return (int) (Math.random() * (max + 0.5d));
    }

    /**
     * Método que devuelve un número entre x e y inclusive
     * @param max Número máximo a generar
     * @param min Número mínimo a generar
     * @return Número (int) aleatorio
     */
    public static int rng(int max, int min) {
        return (int) (Math.random() * (max - min) + (min += 0.5d));
    }

    /**
     * Método que devuelve un número entre 0 y x inclusive
     * @param max Número Máximo a Generar
     * @return Número (long) aleatorio
     */
    public static long rng(long max) {
        return (long) (Math.random() * (max + 0.5d));
    }
    
    /**
     * Método que devuelve un número entre x e y inclusive
     * @param max Número máximo a generar
     * @param min Número mínimo a generar
     * @return Número (long) aleatorio
     */
    public static long rng(long max, long min) {
        return (long) (Math.random() * (max - min) + (min += 0.5d));
    }

    /**
     * Método booleano que hará los cálculos para comprobar si un número es primo
     * @param n Número para comprobar si es primo
     * @return Booleano diciendo si es primo (true) o no (false)
     */
    public static boolean esPrimo(int n) {
        boolean state = true;
        if (n <= 1) {
            state = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    state = false;
                    break;
                }
            }
        } return state;
    }

    /**
     * Método booleano que hará el cálculo para comprobar si un número es par o impar
     * @param n Número a comprobar
     * @return Booleano diciendo si es impar (true) o par (false)
     */
    public static boolean esImpar(int n) {
        boolean state = true;
        if (n % 2 == 0) {
            state = false;
        } return state;
    }

    /**
     * Método que comprueba si ún número es de Kaprekar
     * @param n Número a comprobar
     * @return Booleano diciendo si es de Kaprekar (true) o no (false)
     */
    public static boolean isKaprekar(int n) { // * En teoría no funciona
        boolean s = false;
        int n1, n2, nO = n, nE, c, r;
        if (n != 0) {
            n *= n;
            nE = n;
            c = 0;
            while (n != 0) {
                n = n / 10;
                c++;
            } if (c % 2 == 1) {
                c = c / 2 + 1;
            } else {
                c = c / 2;
            } r = 1;
            while (c != 0) {
                r *= 10;
                c--;
            } n1 = nE / r;
            n = n1 % 10;
            if (n == 0) {
                n1 /= 10;
            } n2 = nE % r;
            if (n1 + n2 == nO) {
                s = true;
            }
        } return s;
    }

    /**
     * Método que devuelve la media entre 2 números
     * @param num1 Primer número
     * @param num2 Segundo número
     * @return Media de los dos números
     */
    public static int media(int num1, int num2) {
        double resultado; // ? Creamos una variable resultado que sea de punto flotante
        resultado = num1 + num2; // ? Sumamamos los 2 numeros
        resultado /= 2.0f; // ? Dividimos entre 2 para conseguir la media aritmética
        resultado += 0.5f; // ? Suamamos 0.5 para redondear en vez de truncar
        return (int) resultado; // ? Devolovemos el resultado en forma de entero
    }

    /**
     * Método que devuelve la media entre 2 números
     * @param num1 Primer número
     * @param num2 Segundo número
     * @return Media de los dos números
     */
    public static long media(long num1, long num2) {
        double resultado; // ? Creamos una variable resultado que sea de punto flotante
        resultado = num1 + num2; // ? Sumamamos los 2 numeros
        resultado /= 2.0f; // ? Dividimos entre 2 para conseguir la media aritmética
        resultado += 0.5f; // ? Suamamos 0.5 para redondear en vez de truncar
        return (long) resultado; // ? Devolovemos el resultado en forma de entero
    }

    /**
     * Método que devuelve la media entre 2 números
     * @param num1 Primer número
     * @param num2 Segundo número
     * @return Media de los dos números
     */
    public static float media(float num1, float num2) {
        double resultado; // ? Creamos una variable resultado que sea de punto flotante
        resultado = num1 + num2; // ? Sumamamos los 2 numeros
        resultado /= 2.0f; // ? Dividimos entre 2 para conseguir la media aritmética
        resultado += 0.5f; // ? Suamamos 0.5 para redondear en vez de truncar
        return (float) resultado; // ? Devolovemos el resultado en forma de entero
    }

    /**
     * Método que devuelve la media entre 2 números
     * @param num1 Primer número
     * @param num2 Segundo número
     * @return Media de los dos números
     */
    public static double media(double num1, double num2) {
        double resultado; // ? Creamos una variable resultado que sea de punto flotante
        resultado = num1 + num2; // ? Sumamamos los 2 numeros
        resultado /= 2.0f; // ? Dividimos entre 2 para conseguir la media aritmética
        resultado += 0.5f; // ? Suamamos 0.5 para redondear en vez de truncar
        return resultado; // ? Devolovemos el resultado en forma de entero
    }

    /**
     * Método que devuelve un caracter aleatorio de los que se encuentran en el array CARACTERES
     * @return
     */
    public static char randomChar() {
        return CARACTERES.charAt(rng(CARACTERES.length() - 1));
    }
}
