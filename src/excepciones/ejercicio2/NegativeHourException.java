package excepciones.ejercicio2;

public class NegativeHourException extends Exception {
    @Override
    public String toString() {
        return
        "La hora introducida es negativa"
        ;
    }
}