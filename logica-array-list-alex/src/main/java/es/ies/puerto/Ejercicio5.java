package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Ejercicio5 {
    static List<Integer> reverseListInput = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

    public static void main(String[] args) {
    }

    /**
     * Revierte el orden de los elementos en una lista.
     * @param list
     * @return
     */
    public static List<Integer> reverseList(List<Integer> list) {
        if(list == null || list.isEmpty()) return new ArrayList<>();
        Collections.reverse(list);
        return list;
    }
}
