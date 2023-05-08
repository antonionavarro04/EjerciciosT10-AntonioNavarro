package ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        // ^ Creamos un array de tipo horas de 4 posiciones
        Hora horas[] = new Hora[4];

        // ! Inicializamos la primera posción del array con el constructor por defecto, no podremos capturar las excepciones pues la función no las lanza
        horas[0] = new Hora();

        try { // ! Inicializamos la segunda posición con el constructor con parámetros, lo unico invalido será la hora
            horas[1] = new Hora(-1, 0, 0);
        } catch (NegativeSecondException e) {
            System.err.println(e);
        } catch (NegativeMinuteException e) {
            System.err.println(e);
        } catch (NegativeHourException e) {
            System.err.println(e);
        }

        try { // ! Inicializamos la tercera posición con el constructor con parámetros, lo unico invalido será el minuto
            horas[2] = new Hora(0, -1, 0);
        } catch (NegativeSecondException e) {
            System.err.println(e);
        } catch (NegativeMinuteException e) {
            System.err.println(e);
        } catch (NegativeHourException e) {
            System.err.println(e);
        }

        try { // ! Inicializamos la cuarta posición con el constructor con parámetros, lo unico invalido será el segundo
            horas[3] = new Hora(0, 0, -1);
        } catch (NegativeSecondException e) {
            System.err.println(e);
        } catch (NegativeMinuteException e) {
            System.err.println(e);
        } catch (NegativeHourException e) {
            System.err.println(e);
        }

        try { // ! Modificamos la hora para que sea invalida
            horas[0].setHora(-1);
        } catch (NegativeHourException e) {
            System.err.println(e);
        }

        try { // ! Modificamos el minuto para que sea invalido
            horas[0].setMinuto(-1);
        } catch (NegativeMinuteException e) {
            System.err.println(e);
        }

        try { // ! Modificamos el segundo para que sea invalido
            horas[0].setSegundo(-1);
        } catch (NegativeSecondException e) {
            System.err.println(e);
        }
    }
}
