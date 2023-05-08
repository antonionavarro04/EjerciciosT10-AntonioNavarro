package ejercicios.ejercicio2;

public class NegativeMinuteException extends Exception {
    @Override
    public String toString() {
        return
        "El minuto introducido es negativo"
        ;
    }
}