package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejercicio1 {
    private static final String ROUTE = "ejercicio1";

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("out\\" + ROUTE + "\\NumerosReales.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();                 
            Math.random();
        }
    }
}
