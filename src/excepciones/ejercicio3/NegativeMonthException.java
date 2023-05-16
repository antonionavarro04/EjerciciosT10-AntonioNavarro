package excepciones.ejercicio3;

public class NegativeMonthException extends Exception {
    @Override
    public String toString() {
        return
        "El mes introducido es negativo"
        ;
    }
}