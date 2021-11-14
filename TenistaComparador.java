import java.util.*;
/**
 * Write a description of class TenistaComparador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TenistaComparador implements Comparator<Tenista>{
    /**
     * Constructor for objects of class TenistaComparador
     */
    public int compare(Tenista tenista1, Tenista tenista2){
        if(tenista1.getPuntosAcumulados() == tenista2.getPuntosAcumulados()){
            return tenista1.getNombre().compareTo(tenista2.getNombre());
        }else if(tenista1.getPuntosAcumulados()> tenista2.getPuntosAcumulados()){
            return 1;
        }else{
            return -1;
        }
    }
}
