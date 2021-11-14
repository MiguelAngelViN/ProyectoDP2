import java.util.*;
/**
 * Write a description of class DesempateComparador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesempateComparador implements Comparator<Tenista>{
    /**
     * Constructor for objects of class DesempateComparador
     */
    public int compare(Tenista tenista1, Tenista tenista2){
        if(tenista1.getPosicionElim() == tenista2.getPosicionElim()){
            return tenista1.getNombre().compareTo(tenista2.getNombre());
        }else if(tenista1.getPosicionElim() > tenista2.getPosicionElim()){
            return 1;
        }else{
            return -1;
        }
    }
}
