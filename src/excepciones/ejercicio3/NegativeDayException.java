package excepciones.ejercicio3;

public class NegativeDayException extends Exception {
    @Override
    public String toString() {
        return
        "El dia introducido es negativo"
        ;
    }
}