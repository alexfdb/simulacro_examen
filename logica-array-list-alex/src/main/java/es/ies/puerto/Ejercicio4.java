package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Ejercicio4 {
  
    static List<Integer> reduceList = new ArrayList<>(Arrays.asList(5, 1, 8, 3, 2));

  public static void main(String[] args) {
  } 
  
  /**
   * Elimina los elementos más pequeños de una lista hasta que queden exactamente N elementos.
   * @param list a operar.
   * @param n numero de elementos que quedaran en la lista.
   * @return la lista actualizada.
   */
  public static List<Integer> reduceToSizeN(List<Integer> list, int n) {
        if(list == null || list.isEmpty()) return new ArrayList<>();
        while (list.size() > n) {
            list.remove(list.indexOf(Collections.min(list)));
        }
        return list;
    }

}
