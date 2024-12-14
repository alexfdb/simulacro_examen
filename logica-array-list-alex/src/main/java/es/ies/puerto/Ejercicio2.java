package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Ejercicio2 {
    static List<Integer> evenList = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

    public static void main(String[] args) {
    }

    /**
     * Verifiqua si todos los números en una lista son pares.
     * @param list en la que comprobar si el valor de sus elementos son pares.
     * @return true si sus valores son pares.
     */
    public static boolean allEven(List<Integer> list) {
        if(list == null) return false;
        if(list.isEmpty()) return true;
        for (Integer integer : list) {
            if(integer % 2 != 0){
                return false;
            }
        }

        return true;
    }
}