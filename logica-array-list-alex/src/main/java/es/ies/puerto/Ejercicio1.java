package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Ejercicio1 {
    static List<Integer> replaceList = new ArrayList<>(Arrays.asList(10, 5, 7, 3, 8));
    static int newValue = 20;
    public static void main(String[] args) {    
    }

    /**
     * Encuentra el menor elemento en una lista, lo reemplace por un nuevo valor, y devuelva la lista actualizada
     * @param list en la que operar.
     * @param newValue que se cambiara por el valor minimo de la lista.
     * @return la lista con las modificaciones.
     */
    public static List<Integer> replaceMinimum(List<Integer> list, int newValue) {
        if(list == null) return null;
        if(list.isEmpty()) return new ArrayList<>();
        if(list.contains(null)) return new ArrayList<>();
        list.set(list.indexOf(Collections.min(list)), newValue);
        return list;
    }
}