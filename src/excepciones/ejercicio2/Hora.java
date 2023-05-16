package excepciones.ejercicio2;

/**
 * Clase que crea una Hora, con todos los atributos, métodos y constructores necesarios para su correcto funcionamiento
 * @author Antonio Navarro
 * @version Release 1.0
 */
public class Hora {
    /**
     * Hora de la Hora
     */
    private int hora;

    /**
     * Minuto de la Hora
     */
    private int minuto;

    /**
     * Segundo de la Hora
     */
    private int segundo;

    /**
     * Constructor por defecto
     */
    public Hora () {
        // ? Constructor sín parámetros
    }

    /**
     * Constructor con parametros, en caso de que se introduzca una hora invalida la corrije y lo avisa
     * @param hora Hora que se va a asignar
     * @param minuto Minuto que se va a asignar
     * @param segundo Segundo que se va a asignars
     * @throws NegativeHourException si el segundo es negativo
     * @throws NegativeMinuteException si el minuto es negativo
     * @throws NegativeHourException si la hora es negativa
     */
    public Hora (int hora, int minuto, int segundo) throws NegativeSecondException, NegativeMinuteException, NegativeHourException {
        if (hora > 23) {
            this.hora = 23;
            System.err.println("Hora puede ser como máximo '23', nuevo valor 23"); 
        } else if (hora < 0) {
            throw new NegativeHourException();
        } if (minuto > 23) {
            this.minuto = 23;
            System.err.println("Minuto puede ser como máximo '59', nuevo valor 59"); 
        } else if (minuto < 0) {
            throw new NegativeMinuteException();
        } if (segundo > 23) {
            this.segundo = 23;
            System.err.println("Segundo puede ser como máximo '59', nuevo valor 59"); 
        } else if (segundo < 0) {
            throw new NegativeSecondException();
        }
    }

    /**
     * Devuelve la hora
     * @return Hora
     */
    public int getHora() {
        return this.hora;
    }

    /**
     * Asigna la hora
     * @param hora Hora que se va a asignar
     * @throws NegativeHourException si la hora es negativa
     */
    public void setHora(int hora) throws NegativeHourException {
        int h;
        if (hora > 23) {
            h = 23;
            System.err.println("La hora como máximo puede ser 23");
        } else if (hora < 0) {
            throw new NegativeHourException();
        } else {
            h = hora;
        } this.hora = h;
    }

    /**
     * Devuelve el minuto
     * @return Minuto
     */
    public int getMinuto() {
        return this.minuto;
    }

    /**
     * Asigna el minuto
     * @param minuto Minuto que se va a asignar
     * @throws NegativeMinuteException si el minuto es negativo
     */
    public void setMinuto(int minuto) throws NegativeMinuteException {
        int m;
        if (minuto > 59) {
            m = 59;
            System.err.println("El minuto como máximo puede ser 59");
        } else if (minuto < 0) {
            throw new NegativeMinuteException();
        } else {
            m = minuto;
        } this.minuto = m;
    }

    /**
     * Devuelve el segundo
     * @return Segundo
     */
    public int getSegundo() {
        return this.segundo;
    }

    /**
     * Asigna el segundo
     * @param segundo Segundo que se va a asignar
     * @throws NegativeSecondException si el segundo es negativo
     */
    public void setSegundo(int segundo) throws NegativeSecondException {
        int s;
        if (segundo > 59) {
            s = 59;
            System.err.println("El segundo como máximo puede ser 59");
        } else if (segundo < 0) {
            throw new NegativeSecondException();
        } else {
            s = segundo;
        } this.segundo = s;
    }
    
    /**
     * Incrementa en 1 segundo la hora, en caso de que haya que aumentar algun otro atributo lo hará
     */
    public void incrementaSegundo() {
        this.segundo++;

        if (segundo == 60) { // ? Si el segundo es 60, se pasa al minuto siguiente y se reinicia el segundo
            minuto++;
            segundo = 0;
        } if (minuto == 60) { // ? Si el minuto es 60, se pasa a la hora siguiente y se reinicia el minuto
            hora++;
            minuto = 0;
        } if (hora == 24) { // ? Si la hora es 24, se reinicia la hora
            hora = 0;
        }
    }
}
