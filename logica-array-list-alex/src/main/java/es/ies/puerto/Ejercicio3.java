package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Ejercicio3 {
    static List<String> words = new ArrayList<>(Arrays.asList("Hola", "Mundo", "Java"));

    public static void main(String[] args) {
    }

    /**
     * Recibe una lista de palabras y genera una nueva lista con las longitudes de cada palabra.
     * @param words lista a operar.
     * @return la nueva lista.
     */
    public static List<Integer> wordLengths(List<String> words) {
        if(words == null || words.isEmpty()) return new ArrayList<>();
        List<Integer> solucion = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            solucion.add(words.get(i).length());
        }

        return solucion;
    }
}
