package ficheros.ejercicio7;

import java.util.Map;

public class Methods {
    public static String menu() {
        return
        "1. Nuevo Contacto"
        + "\n2. Buscar por Nombre"
        + "\n3. Mostrar Todos"
        + "\n" + Main.SALIR + ". Guardar y Salir"
        + "\n>>> "
        ;
    }

    public static boolean newContact(String s, int n) {
        // ^ Definimos un boolean a false y un Object
        Object code;
        boolean state = false;

        code = Main.agenda.put(s, n);

        if (code == null) { // ? Si el contacto no existía la operación habrá sido correcta
            state = true;
        } else {
            int v = (int) code;
            Main.agenda.replace(s, v);
        } return state;
    }

    public static String searchContact(String n) {
        String s = "El contacto no ha sido Encontrado...";

        if (Main.agenda.containsKey(n)) {
            s = "\"" + n + "\" -> " + Main.agenda.get(n);
        } return s;
    }

    public static String printContact() {
        String s = "";

        if (Main.agenda.isEmpty()) {
            s = "La Agenda está vacía...";
        } else {
            for (Map.Entry<String, Integer> entry : Main.agenda.entrySet()) {
                s +=
                "\"" + entry.getKey() + "\" -> " + entry.getValue() + "\n"
                ;
            }
        } return s;
    }
}
