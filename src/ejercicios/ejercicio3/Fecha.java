package ejercicios.ejercicio3;

/**
 * Clase que crea una Fecha, con todos los atributos, métodos y constructores necesarios para su correcto funcionamiento
 * @author Antonio Navarro
 * @version Release 1.0
 */
public class Fecha {
    /**
     * Día de la Fecha
     */
    private int dia;

    /**
     * Mes de la Fecha
     */
    private int mes;

    /**
     * Año de la Fecha
     */
    private int año;

    /**
     * Constructor por Defecto
     */
    public Fecha () {
        // ? Constructor por Defecto
    }

    /**
     * Constructor por parámetros, ajustará y notificará la fecha en caso de que haya un error
     * @param dia Día de la Fecha
     * @param mes Mes de la Fecha
     * @param año Año de la Fecha
     */
    public Fecha (int dia, int mes, int año) throws NegativeMonthException, NegativeDayException {
        // ^ Definimos una variable booleana de control para saber si hay fallos en el dia
        boolean fallos = false;

        this.año = año;

        if (mes > 12) {
            System.err.println("Mes como máximo puede valer '12', nuevo valor 12");
            this.mes = 12;
        } else if (mes < 1) {
            throw new NegativeMonthException();
        } else {
            this.mes = mes;
        }

        if (dia < 1) { // ? En caso de que el día sea menor que 1, lo pondremos a 1
            throw new NegativeDayException();
        } else { // ? Si no vamos a comprobar según el mes si se pasa o no de los días
            switch (this.mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia > 31) { // ? Si el mes tiene 31 dias como maximo puede valer 31
                        System.err.println("Día como máximo puede valer '31', nuevo valor 31");
                        this.dia = 31;

                        fallos = true;
                    } break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia > 30) { // ? Si el mes tiene 30 dias como maximo puede valer 30
                        System.err.println("Día como máximo puede valer '30', nuevo valer 30");
                        this.dia = 30;

                        fallos = true;
                    } break;
                case 2: // ? Si es febrero
                    if (this.año % 4 == 0) { // ? Si el año es bisiesto, como maximo será 29
                        if (dia > 29) {
                            System.err.println("Díá como máximo puede valer '29', nuevo valor 29");
                            this.dia = 29;

                            fallos = true;
                        }
                    } else { // ? Si no es bisiesto, como maximo será 28
                        if (dia > 28) {
                            System.err.println("Día como máximo puede valer '28', nuevo valor 28");
                            this.dia = 28;
                            
                            fallos = true;
                        }
                    } break;
            }

            if (!fallos) { // ? En caso de que no haya tenido fallos aceptaremos el díá que nos introduce el usuario
                this.dia = dia;
            }
        }
    }

    /**
     * Devuelve el día de la Fecha
     * @return Día de la Fecha
     */
    public int getDia() {
        return this.dia;
    }

    /**
     * Establece el día de la Fecha
     * @param dia Día de la Fecha TODO Implemntar Excepcuiones en SET
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Devuelve el mes de la Fecha
     * @return Mes de la Fecha
     */
    public int getMes() {
        return this.mes;
    }

    /**
     * Establece el mes de la Fecha
     * @param mes Mes de la Fecha
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Devuelve el año de la Fecha
     * @return Año de la Fecha
     */
    public int getAño() {
        return this.año;
    }

    /**
     * Establece el año de la Fecha
     * @param año Año de la Fecha
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Función booleana que devolverá 'true' si el año es bisiesto y 'false' si no lo es
     * @return booleano que indica si el año es bisiesto o no
     */
    public boolean esBisiesto() {
        boolean state = false;

        if (this.año % 4 == 0) {
            state = true;
        } return state;
    }

    /**
     * Función booleana que devolverá 'true' si la fecha es correcta y 'false' si no lo es, la función no indicá en donde se encuentra el error
     * @return booleano que indica si la fecha es correcta o no
     */
    public boolean fechaCorrecta() {
        // ^ Inicializamos una variable booleana de control
        boolean state = true;

        if (this.mes > 12 || this.mes < 1) { // ? En caso de que el mes este fuera de rango pondremos la variable de control a 'false'
            state = false;
        } else { // ? Si no comprobaremos el día
            if (this.dia < 1) { // ? En caso de que el día sea menor que 1 pondremos la variable de control a 'false'
                state = false;
            } else { // ? Si no comprobaremos según el mes si se pasa o no de los días
                switch (this.mes) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (this.dia > 31) { // ? Si el mes tiene 31 dias y se pasa de 31 pondremos la variable de control a 'false'
                            state = false;
                        } break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (this.dia > 30) { // ? Si el mes tiene 30 dias y se pasa de 30 pondremos la variable de control a 'false'
                            state = false;
                        } break;
                    case 2:
                        if (esBisiesto()) { // ? Si es febrero y es bisiesto como maximo será 29
                            if (this.dia > 29) {
                                state = false;
                            }
                        } else { // ? Si no es bisiesto como maximo será 28
                            if (this.dia > 28) {
                                state = false;
                            }
                        } break;
                } // ? El año no se comprueba ya que no hay un limite ni un minimo para el año
            }
        } return state;
    }

    /**
     * Función que avanza un día la fecha, si hay que cambiar de més o de año, la función se encarga de hacerlo correctamente
     */
    public void diaSiguiente() {
        this.dia++; // ! Avanzamos un dia

        switch (this.mes) { // ? Según el mes comprobaremos si se pasa del limute de días o no
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (this.dia > 31) {
                    this.mes++;
                    this.dia = 1;
                } break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (this.dia > 30) {
                    this.mes++;
                    this.dia = 1;
                } break;
            case 12: // ? Si es diciembre y se pasa de 31 aumentaremos también el año
                if (this.dia > 31) {
                    this.mes = 1;
                    this.dia = 1;
                    this.año++;
                } break;
            case 2:
                if (esBisiesto()) {
                    if (this.dia > 29) {
                        this.mes++;
                        this.dia = 1;
                    }
                } else {
                    if (this.dia > 28) {
                        this.mes++;
                        this.dia = 1;
                    }
                }
        }
    }

    /**
     * Función que devuelve una String con la información de la fecha, separada por guiones. Si el dia o el mes solo tiene una cifra se le añade un 0 delante
     */
    public String toString() {
        return (dia < 10 ? "0" + dia : dia) + "-" + (mes < 10 ? "0" + mes : mes) + "-" + año;
    }
}
